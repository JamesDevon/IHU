# -*- coding: utf-8 -*-
"""
Created on Thu Apr 04 14:36:20 2019

@author: user
"""
# -*- coding: utf-8 -*-
from pandas import read_csv
import matplotlib.pyplot as plt
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.neural_network import MLPClassifier

#Voids
def accuracy(tn , tp , fn, fp):
    return (tp+tn+0.00000000001)/(tp+tn+fp+fn+0.00000000001)

def precision(tn , tp , fn, fp):
    return (tp+0.00000000001)/(tp+fp+0.00000000001)

def recall(tn , tp , fn, fp):
    return (tp+0.00000000001)/(tp+fn+0.00000000001)

def fmeasure(tn , tp , fn, fp):
    return (precision(tn, tp, fn, fp)*recall(tn, tp, fn, fp)+0.00000000001)/((precision(tn, tp, fn, fp)+recall(tn, tp, fn, fp))/2+0.00000000001)

def specificity(tn , tp , fn, fp):
    return ((tn+0.00000000001)/(tn+fp+0.00000000001))

def evaluate(t, predict, criterion):
    switcher= { "accuracy": accuracy, "precicion": precision, "recall": recall, "fmeasure" : fmeasure , "sensitivity": recall , "specificity":specificity }
    tN = float(0)
    tP = float(0)
    fN = float(0)
    fP = float(0)
    for i in range(len(t)):
        if (t[i]==0):
            if(predict[i]==0):
                tN +=1
            else:
                fP +=1
        else:
            if(predict[i]==0):
                fN +=1
            else:
                tP +=1
    #Calling function with parameters through dictionary
    return switcher[criterion]( tN, tP, fN, fP)

def setosa():
    map_dict = { "Iris-setosa": 1 , "Iris-versicolor": 0 , "Iris-virginica": 0  }
    i = 0 
    for fl in data:
        t[i] = map_dict[fl[4]]
        i+=1        

def versicolor():
    map_dict = { "Iris-setosa": 0 , "Iris-versicolor": 1 , "Iris-virginica": 0  }
    i = 0 
    for fl in data:
        t[i] = map_dict[fl[4]]
        i+=1

def virginica():
    map_dict = { "Iris-setosa": 0 , "Iris-versicolor": 0 , "Iris-virginica": 1  }
    i = 0 
    for fl in data:
        t[i] = map_dict[fl[4]]
        i+=1

def answer():
    print('To continue press y , else n')
    ans = input("Answer : ")
    return ans

#/voids
    
#main
data = read_csv('http://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data', header=None).values
numberOfAttributes = len(data[1])
numberOfPatterns = len(data)
x = np.matrix((data[:,0:4 ]) , dtype = 'float')
plt.figure(1)
plt.plot( x[0:50,0] , x[0:50,2] , 'bo', label="Iris Setosa")
plt.plot( x[50:100,0] , x[50:100,2] , 'r*' , label="Iris Versicolor")
plt.plot( x[100:150,0] , x[100:150,2] , 'g+', label="Iris Virginica")
plt.legend()
plt.show(1)
ones = np.ones((numberOfPatterns,1))
x = np.hstack((x,ones))
t = np.zeros(numberOfPatterns)
ans = 'y'

activation_dict = {  1 : 'logistic' , 2 : 'tanh'}
solver_dict = {1 : 'sgd'   ,  2 : 'adam'  , 3 :'lbfgs'}
learningRateDict = {1:'constant', 2:'invscaling', 3:'adaptive'}
while(ans == 'y' ):
    print('for Iris-setosa -> 1')
    print('for Iris-versicolor -> 2')
    print('for Iris-virginica -> 3')
    ch = int(input("Enter your selection : "))
    if(ch==1):
        setosa()
    elif(ch==2):
        versicolor()
    else:
        virginica()
    
    #Manual Seperation into Train Test set
    xtrain = np.vstack((x[0:40,:],x[50:90,:],x[100:140,:]))
    ttrain = np.hstack((t[0:40],t[50:90],t[100:140]))
    xtest = np.vstack((x[40:50,:],x[90:100,:],x[140:150,:]))
    ttest = np.hstack((t[40:50],t[90:100],t[140:150]))
    
    plt.figure(2)
    plt.plot(xtrain[:,0] , xtrain[:,2] , 'bo' )
    plt.xlabel("x") 
    plt.ylabel("y")
    plt.plot(xtest[:,0] , xtest[:,2] , 'ro' )
    plt.show(2)
    #Creation of -1 | 1 Array
    ttrain1 = (len(ttrain),1)
    ttrain1 = np.zeros(ttrain1)
    ttest1 = (len(ttest),1)
    ttest1 = np.zeros(ttest1)

    for j in range(len(ttrain)):
        ttrain1[j] = (ttrain[j]*2)-1
    for j in range(len(ttest)):
        ttest1[j]= (ttest[j]*2)-1
        
    print("For logistic -> 1")
    print("For tanh -> 2")
    activation = int(input("Dose sunartisi energopioisis :"))
    print("For sgd -> 1")
    print("For adam -> 2")
    print("For lbfgs -> 3")
    solver = int(input("Dose solver : "))
    hiddenNeurals = int(input("Give the number of neurals for hidden layer : "))
    epoxes = int(input("Dose plithos epoxon : "))
    #Creating a MPL model
    network = MLPClassifier(hidden_layer_sizes = hiddenNeurals,activation = activation_dict[activation],solver = solver_dict[solver], max_iter = epoxes)
    w = network.fit(xtrain , np.ravel(ttrain))
    predicttrain = w.predict(xtrain)
    plt.figure(3)
    plt.plot(ttrain[:] , 'b.')
    plt.plot(predicttrain[:] , 'ro' , fillstyle='none' , markersize=9.5)
    plt.show(3)
        
    predicttest = w.predict(xtest)
    plt.figure(4)
    plt.plot(ttest[:] , 'b.')
    plt.plot(predicttest[:] , 'ro' , fillstyle='none' , markersize=9.5)
    plt.show(4)
    
    

    plt.figure(5)

    for i in range(9):
        xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1)
        plt.subplot(3,3,i+1)
        plt.plot(xtrain[:,0] , xtrain[:,2] , 'bo' )
        plt.xlabel("x") 
        plt.ylabel("y")
        plt.title("Fold "+str(i))
        plt.plot(xtest[:,0] , xtest[:,2] , 'ro')

    plt.show(5)

    acc = float(0)
    prec = float(0)
    rec = float(0)
    fmeas = float(0)
    spec = float(0)
    
    #Epilogi sunartisis energopioisis
    print("For logistic -> 1")
    print("For tanh -> 2")
    activation = int(input("Dose sunartisi energopioisis :"))
    print("For sgd -> 1")
    print("For adam -> 2")
    print("For lbfgs -> 3")
    solver = int(input("Dose solver : "))
    hiddenNeurals = int(input("Give the number of neurals for hidden layer : "))
    epoxes = int(input("Dose plithos epoxon : "))
    network = MLPClassifier(hidden_layer_sizes = hiddenNeurals,activation = activation_dict[activation],solver = solver_dict[solver], max_iter = epoxes)
    xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1)
    ttrain1 = (len(ttrain),1)
    ttrain1 = np.zeros(ttrain1)
    ttest1 = (len(ttest),1)
    ttest1 = np.zeros(ttest1)
    for j in range(len(ttrain)):
        ttrain1[j] = (ttrain[j]*2)-1
    for j in range(len(ttest)):
        ttest1[j]= (ttest[j]*2)-1
    Ptrain = len(xtrain)
    Ptest = len(xtest)
    w = network.fit(xtrain , np.ravel(ttrain))
    predicttrain = w.predict(xtrain)
    plt.figure(6)
    plt.plot(ttrain[:] , 'b.')
    plt.plot(predicttrain[:] , 'ro' , fillstyle='none' , markersize=9.5)
    
    plt.show(6)
    predicttest = w.predict(xtest)
    plt.figure(7)
    plt.plot(ttest[:] , 'b.')
    plt.plot(predicttest[:] , 'ro' , fillstyle='none' , markersize=9.5)
    plt.show(7)
    
    plt.figure(8)
    for i in range(9):
        xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1)
        ttrain1 = (len(ttrain),1)
        ttrain1 = np.zeros(ttrain1)
        ttest1 = (len(ttest),1)
        ttest1 = np.zeros(ttest1)
    
        for j in range(len(ttrain)):
            ttrain1[j] = (ttrain[j]*2)-1
        for j in range(len(ttest)):
            ttest1[j]= (ttest[j]*2)-1
            
        Ptrain = len(xtrain)
        Ptest = len(xtest)
        w = network.fit(xtrain , np.ravel(ttrain))

        predicttrain = w.predict(xtrain)

        predicttest = w.predict(xtest)
        plt.subplot(3,3,i+1)
        plt.plot(ttest[:] , 'b.')
        plt.plot(predicttest[:] , 'ro' , fillstyle='none' , markersize=9.5)
        
        acc += evaluate(ttest , predicttest, "accuracy")
        prec += evaluate(ttest, predicttest, "precicion")
        rec += evaluate(ttest, predicttest, "recall")
        fmeas += evaluate(ttest,predicttest, "fmeasure")
        spec += evaluate(ttest, predicttest, "specificity")

    plt.show(8)
    acc /=9
    prec /=9
    rec /=9
    fmeas /=9
    spec/=9
    print ("Mean Accuracy : " + str(acc))
    print ("Mean Precicion : " + str(prec))
    print ("Mean Recall : " + str(rec))
    print ("Mean Fmeasure : " + str(fmeas))
    print("Mean Sensitivity : " + str(rec))
    print("Mean Specificity : " + str(spec))
    ans = answer()

if(ans == 'n'):
    print('Goodbye!')