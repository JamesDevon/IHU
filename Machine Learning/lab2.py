"""
Created on Tue Mar 26 20:32:35 2019

@author: James
"""
# -*- coding: utf-8 -*-
from pandas import read_csv
import matplotlib.pyplot as plt
import numpy as np
from sklearn.model_selection import train_test_split

#Voids
def accuracy(tn , tp , fn, fp):
    return (tp+tn)/(tp+tn+fp+fn)

def precision(tn , tp , fn, fp):
    return (tp)/(tp+fp)

def recall(tn , tp , fn, fp):
    return (tp)/(tp+fn)

def fmeasure(tn , tp , fn, fp):
    return (precision(tn, tp, fn, fp)*recall(tn, tp, fn, fp))/((precision(tn, tp, fn, fp)+recall(tn, tp, fn, fp))/2)

def specificity(tn , tp , fn, fp):
    return (tn/(tn+fp))

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
    ans = input("Answer : ")
    return ans

#/voids

#main
data = read_csv('http://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data', header=None).values
x = data.shape
x = np.matrix((data[:,0:4 ]) , dtype = 'float')
plt.figure(1)
plt.plot( x[0:50,0] , x[0:50,2] , 'bo')
plt.plot( x[50:100,0] , x[50:100,2] , 'r*')
plt.plot( x[100:150,0] , x[100:150,2] , 'g+')
plt.show(1)
ones = (150,1)
ones = np.ones(ones)
x = np.hstack((x,ones))
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

    for i in range(9):
        xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1)
        plt.subplot(3,3,i+1)
        plt.plot(xtrain[:,0] , xtrain[:,2] , 'bo' )
        plt.xlabel("x") 
        plt.ylabel("y")
        plt.title("Fold "+str(i))
        plt.plot(xtest[:,0] , xtest[:,2] , 'ro')

    plt.show(2)

    acc = float(0)
    prec = float(0)
    rec = float(0)
    fmeas = float(0)
    spec = float(0)
    plt.figure(5)
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
    
        pseudoxTrain = np.linalg.pinv(xtrain)
        w = np.matmul(np.transpose(ttrain1) , np.transpose(pseudoxTrain))
        ytrain = w*np.transpose(xtrain)
        ytrain = np.transpose(ytrain)
        predicttrain = ytrain.shape
        predicttrain = np.zeros(predicttrain)
        for j in range(len(ytrain)):
            if(ytrain[j]<0):
                predicttrain[j] = 0
            else:
                predicttrain[j] = 1
        pseudoxTest = np.transpose(np.linalg.pinv(xtest))
        w = np.matmul(np.transpose(ttest1) , pseudoxTest)
        ytest = w*np.transpose(xtest)
        ytest = np.transpose(ytest)
        predicttest = ytest.shape
        predicttest = np.zeros(predicttest)
        for j in range(len(ytest)):
            if(ytest[j]<0):
                predicttest[j] = 0
            else:
                predicttest[j] = 1
                
        Ptrain = len(xtrain)
        Ptest = len(xtest)
        acc += evaluate(ttest , predicttest, "accuracy")
        prec += evaluate(ttest, predicttest, "precicion")
        rec += evaluate(ttest, predicttest, "recall")
        fmeas += evaluate(ttest,predicttest, "fmeasure")
        spec += evaluate(ttest, predicttest, "specificity")
        
        plt.subplot(3,3,i+1)
        plt.plot(ttest[:,:] , 'b.')
        plt.plot(predicttest[:,:] , 'ro' , fillstyle='none' , markersize=9.5)

    plt.show(5)
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
#/main