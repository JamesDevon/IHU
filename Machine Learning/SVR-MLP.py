# -*- coding: utf-8 -*-
"""
Created on Thu May 16 14:42:27 2019

@author: James
"""

"""1. CRIM       per capita crime rate by town
    2. ZN        proportion of residential land zoned for lots over 
                 25,000 sq.ft.
    3. INDUS     proportion of non-retail business acres per town
    4. CHAS      Charles River dummy variable (= 1 if tract bounds 
                 river; 0 otherwise)
    5. NOX       nitric oxides concentration (parts per 10 million)
    6. RM        average number of rooms per dwelling
    7. AGE       proportion of owner-occupied units built prior to 1940
    8. DIS       weighted distances to five Boston employment centres
    9. RAD       index of accessibility to radial highways
    10. TAX      full-value property-tax rate per $10,000
    11. PTRATIO  pupil-teacher ratio by town
    12. B        1000(Bk - 0.63)^2 where Bk is the proportion of blacks 
                 by town
    13. LSTAT    % lower status of the population
    14. MEDV     Median value of owner-occupied homes in $1000's"""
    
def regEvaluate(t, predict , criterion):
    value = 0
    if(criterion=="mse"):
        for i in range(len(t)):
            value +=(t[i]-predict[i])**2
        value /= len(t)
    elif(criterion=="mae"):
        for i in range(len(t)):
            value += abs(t[i]-predict[i])
        value /= len(t)
    return value

def answer():
    print('To continue press y , else n')
    ans = str(input("Answer : "))
    return ans

from pandas import read_csv
import matplotlib.pyplot as plt
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.neural_network import MLPRegressor
from sklearn.svm import SVR

data = np.matrix(read_csv('http://archive.ics.uci.edu/ml/machine-learning-databases/housing/housing.data', sep="\\s+", header=None).values, dtype=float)
attributes = data.shape[1]
paterns = data.shape[0]
x = np.zeros((attributes-1,paterns))
t = np.zeros((1,paterns))
x = data[:,0:13]
t = data[:,13]


gamma=[0.0001, 0.001, 0.01, 0.1]
c=[1, 10, 100, 1000]

N=[5,10,20,30,40,50,100]
ans = 'y'
while(ans == 'y' ):
    plotIndex = 1
    m = [[],[]]
    mseIndex = 0
    gammaMse = 0
    cMse = 0
    maeIndex = 0
    gammaMae = 0
    cMae = 0
    #SVR
    for i in range(len(gamma)):
        for j in range(len(c)):
            #Μέσο Τετραγωνικό Σφάλμα 
            mse = 0
            #Μέσο Απόλυτο Σφάλμα
            mae = 0
            print("For C : "+str(c[j]))
            print("For gamma : "+str(gamma[i]))
            plt.figure(plotIndex)
            for k in range(9):
                xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1 , random_state = k)
                model = SVR(kernel="rbf",gamma = gamma[i] , C = c[j])
                network = model.fit(xtrain,np.ravel(ttrain))
                predictTest = network.predict(xtest)
                mse += regEvaluate(ttest , predictTest, "mse" )
                mae += regEvaluate(ttest , predictTest, "mae")
                plt.subplot(3,3,k+1)
                plt.plot(ttest[:] , 'b-')
                plt.plot(predictTest[:] , 'r.')
            mse /= 9
            mae /= 9
            print("MSE : "+str(mse))
            print("MAE : "+str(mae))
            
            m[0].append(mse)
            m[1].append(mae)
            #Ευρεση ελαχηστου Μεσου Απολυτου και Τετραγωνικου Σφάλματος
            if(m[0][mseIndex]>m[0][len(m[0])-1]):
                mseIndex = len(m[0])-1
                lessMseSvr = m[0][mseIndex]
                gammeMse = i
                cMse = j
            if(m[1][maeIndex]>m[1][len(m[1])-1]):
                maeIndex = len(m[1])-1
                lessMaeSvr = m[1][maeIndex]
                gammeMae = i
                cMae = j

            plt.show(plotIndex)
            plotIndex +=1
            print("-----------------------------------------------------")
            
    
    print("Μικρότερο MSE : "+str(lessMseSvr)+" με C : "+str(c[cMse])+" kai gamma : "+str(gamma[gammaMse]))
    print("Μικρότερο MAE : "+str(lessMaeSvr)+" με C : "+str(c[cMae])+" kai gamma : "+str(gamma[gammaMae]))
    print("-----------------------------------------------------")
    print("For gamma : "+str(gamma[gammaMse])+" and c : "+str(c[cMse]))
    #MLP
    xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1)
    model = SVR(kernel="rbf",gamma = gamma[gammaMse] , C = c[cMse])
    network = model.fit(xtrain,np.ravel(ttrain))
    predictTest = network.predict(xtest)
    mse =regEvaluate(ttest , predictTest, "mse" )
    mae = regEvaluate(ttest , predictTest, "mae")
    plt.figure(1)
    plt.plot(ttest[:] , 'b-')
    plt.plot(predictTest[:] , 'r.')
    plt.show(1)
    mseIndex = 0
    maeIndex = 0
    m1 = [[],[]]
    nMae =0
    nMse = 0
    print("-----------------------------------------------------")
    print("-----------------------------------------------------")
    print("Neural Network :")
    for i in range (len(N)):
        mse = 0
        mae = 0
        print("For N : "+str(N[i]))
        plt.figure(plotIndex)
        for k in range(9):
            xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1 , random_state = k)
            model = MLPRegressor(hidden_layer_sizes = N[i],activation = "logistic" ,solver = "lbfgs", max_iter = 1000)
            network = model.fit(xtrain,np.ravel(ttrain))
            predictTest = network.predict(xtest)
            mse += regEvaluate(ttest , predictTest, "mse" )
            mae += regEvaluate(ttest , predictTest, "mae")
            plt.subplot(3,3,k+1)
            plt.plot(ttest[:] , 'b-')
            plt.plot(predictTest[:] , 'r.')
            
        mse /= 9
        mae /= 9
        print("MSE : "+str(mse))
        print("MAE : "+str(mae))
        
        m1[0].append(mse)
        m1[1].append(mae)
        if(m1[0][mseIndex]>m1[0][len(m1[0])-1]):
            mseIndex = len(m1[0])-1
            lessMseMlp = m1[0][mseIndex]
            nMse = i
        if(m1[1][maeIndex]>m1[1][len(m1[1])-1]):
            maeIndex = len(m1[1])-1
            lessMaeMlp = m1[1][maeIndex]
            nMae = i
            
        plt.show(plotIndex)
        plotIndex +=1
        print("-----------------------------------------------------")
    

    print("Μικρότερο MSE : "+str(lessMseMlp)+"με πλήθος κρυφών νευρώνων : "+str(N[nMse]))
    print("Μικρότερο MAE : "+str(lessMaeMlp)+"με πλήθος κρυφών νευρώνων : "+str(N[nMae]))
    print("-----------------------------------------------------")
    
    if(lessMseMlp<lessMseSvr):
        print("Mlp scored better at MSE with : "+str(lessMseMlp)+" while Svr scored : "+str(lessMseSvr))
    else:
        print("Svr scored better at MSE with : "+str(lessMseSvr)+" while Mlp scored : "+str(lessMseMlp))
    if(lessMaeMlp>lessMseSvr):
        print("Mlp scored better at MAE with : "+str(lessMaeMlp)+" while Svr scored : "+str(lessMaeSvr))
    else:
        print("Svr scored better at MAE with : "+str(lessMaeSvr)+" while Mlp scored : "+str(lessMaeMlp))
    print("-----------------------------------------------------")
    print("For N : "+str(N[nMse]))
    xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1)
    model = MLPRegressor(hidden_layer_sizes = N[nMse],activation = "logistic" ,solver = "lbfgs", max_iter = 1000)
    network = model.fit(xtrain,np.ravel(ttrain))
    predictTest = network.predict(xtest)
    mse =regEvaluate(ttest , predictTest, "mse" )
    mae = regEvaluate(ttest , predictTest, "mae")
    plt.figure(2)
    plt.plot(ttest[:] , 'b-')
    plt.plot(predictTest[:] , 'r.')
    plt.show(2)
    ans= answer()
if(ans == 'n'):
    print('Goodbye!')