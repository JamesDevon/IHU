# -*- coding: utf-8 -*-
"""
Created on Thu Apr 11 14:57:22 2019
@author: James
"""

from pandas import read_csv
import matplotlib.pyplot as plt
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.svm import SVC

def accuracy(tn , tp , fn, fp):
    return (tp+tn+0.0000001)/(tp+tn+fp+fn+0.0000001)

def precision(tn , tp , fn, fp):
    return (tp+0.0000001)/(tp+fp+0.0000001)

def recall(tn , tp , fn, fp):
    return (tp+0.0000001)/(tp+fn+0.0000001)

def fmeasure(tn , tp , fn, fp):
    return (precision(tn, tp, fn, fp)*recall(tn, tp, fn, fp)+0.0000001)/((precision(tn, tp, fn, fp)+recall(tn, tp, fn, fp)+0.0000001)/2)

def specificity(tn , tp , fn, fp):
    return (tn+0.0000001/(tn+fp)+0.0000001)

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
    ans = str(input("Answer : "))
    return ans

#Main
data = read_csv('http://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data', header=None).values
x = data.shape
x = np.matrix((data[:,0:4 ]) , dtype = 'float')
plt.figure(1)
plt.plot( x[0:50,0] , x[0:50,2] , 'bo')
plt.plot( x[50:100,0] , x[50:100,2] , 'r*')
plt.plot( x[100:150,0] , x[100:150,2] , 'g+')
plt.show(1)
t = (150,1)
t = np.zeros(t)
ans = 'y'
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
    plt.figure(2)
    
    bestAcc = 0;
    gamma = [0.01 , 0.03, 0.1, 0.3, 1]
    C = [1, 10 , 100, 1000]
    plotIndex = 1;
    for j in range (4):
        
        for k in range (5):
            acc = float(0)
            prec = float(0)
            rec = float(0)
            fmeas = float(0)
            spec = float(0)
            print("---------------------------------------------------------")
            print("C = "+str(C[j])+" gamma = "+str(gamma[k]))
            plt.figure(plotIndex)
            for i in range(9):
                
                xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1)
                network = SVC(C=C[j], kernel = 'rbf', gamma = gamma[k])
                w = network.fit(xtrain,np.ravel(ttrain))
                predictTest = w.predict(xtest)
                
                acc += evaluate(ttest , predictTest, "accuracy")
                prec += evaluate(ttest, predictTest, "precicion")
                rec += evaluate(ttest, predictTest, "recall")
                fmeas += evaluate(ttest,predictTest, "fmeasure")
                spec += evaluate(ttest, predictTest, "specificity")
                plt.subplot(3,3,i+1)
                plt.plot(ttest[:] , 'b.')
                plt.plot(predictTest[:] , 'ro', fillstyle='none' , markersize=9.5)
            
            plt.show(plotIndex)
            plotIndex +=1
            
            acc /=9
            if(acc>bestAcc):
                bestAcc = acc
                bestGamma = gamma[k]
                bestC = C[j]
                
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
    print("------------------------------------------------------------------------")
    print("Best performance with gamma : "+str(bestGamma)+" and C : "+str(bestC)+", Accuracy : "+str(bestAcc))
    print("------------------------------------------------------------------------")
    print("Try it yourself!")
    gamma = float(input("Gamma : "))
    c = float(input("C : "))
    acc = float(0)
    prec = float(0)
    rec = float(0)
    fmeas = float(0)
    spec = float(0)
    print("---------------------------------------------------------")
    plt.figure(plotIndex+1)
    for i in range(9):
        
        xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1)
        network = SVC(C=c, kernel = 'rbf', gamma = gamma)
        w = network.fit(xtrain,np.ravel(ttrain))
        predictTest = w.predict(xtest)
        
        acc += evaluate(ttest , predictTest, "accuracy")
        prec += evaluate(ttest, predictTest, "precicion")
        rec += evaluate(ttest, predictTest, "recall")
        fmeas += evaluate(ttest,predictTest, "fmeasure")
        spec += evaluate(ttest, predictTest, "specificity")
        plt.subplot(3,3,i+1)
        plt.plot(ttest[:] , 'b.')
        plt.plot(predictTest[:] , 'ro', fillstyle='none' , markersize=9.5)
        
    plt.show(plotIndex+1)
    plotIndex +=1
        
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