# -*- coding: utf-8 -*-
"""
Created on Sat May 11 16:35:16 2019

@author: James
"""

from __future__ import division
from pandas import read_csv
import matplotlib.pyplot as plt
import numpy as np
from sklearn.model_selection import train_test_split
from scipy.stats import norm

def nbTrain(x,t):
    
    c0 = np.matrix([0,0,0,0])
    c1 = np.matrix([0,0,0,0])
    ekp = []
    #Μέση τιμή C0,C1
    m = [[],[]]
    #Διασπορά C0,C1
    s = [[],[]]
    #Seperate patterns into 2 arrays (Class 0, Class 1)
    for i in range(len(t)):
        if(t[i]==0):
            c0 = np.vstack([c0 , x[i]])     
        else:
            c1 = np.vstack([c1 , x[i]])
    c0 = np.delete(c0 , 0, 0)
    c1 = np.delete(c1 , 0, 0)
    c0p = len(c0)
    c1p = len(c1)
    #Εκ των προτέρων πιθανότητες
    ekp.append(c0p/len(x))
    ekp.append(c1p/len(x))
    for i in range(4):
        m[0].append(np.mean(c0[:,i],axis=0))
        s[0].append(np.std(c0[:,i],axis=0))
    for i in range(4):
        m[1].append(np.mean(c1[:,i] , axis=0))
        s[1].append(np.std(c1[:,i] , axis=0))
    model = {'prior' : ekp , 'mu' : m , 'sigma' : s}
    return model

def nbPredict(x,model):
    #Πιθανότητα Λ
    l = []
    predict = []
    for p in range(len(x)):
        #Αρχικά
        l.append(model['prior'][1]/model['prior'][0])
        for i in range(4):
            #Ενημέρωση του Λ με συνάρτηση norm.pdf()
            l[p]*=(norm.pdf(x[p,i] , loc = model['mu'][1][i] 
            , scale = model['sigma'][1][i])/norm.pdf(x[p,i] 
            , loc = model['mu'][0][i] , scale = model['sigma'][0][i]))
        if l[p] > 1:
            predict.append(1)
        else:
            predict.append(0)
    return predict

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
    switcher= { "accuracy": accuracy, "precicion": precision
               , "recall": recall, "fmeasure" : fmeasure 
               , "sensitivity": recall , "specificity":specificity }
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

#Main
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
t = np.zeros(numberOfPatterns)
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
    
    acc = float(0)
    prec = float(0)
    rec = float(0)
    fmeas = float(0)
    spec = float(0)
    plt.figure(2)
    for i in range(9):
        xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1)
        bayesModel = nbTrain(xtrain,ttrain)
        predictTest = nbPredict(xtest , bayesModel)
        
        plt.subplot(3,3,i+1)
        plt.plot(ttest[:] , 'b.')
        plt.plot(predictTest[:] , 'ro' , fillstyle='none' , markersize=9.5)
        
        acc += evaluate(ttest , predictTest, "accuracy")
        prec += evaluate(ttest, predictTest, "precicion")
        rec += evaluate(ttest, predictTest, "recall")
        fmeas += evaluate(ttest,predictTest, "fmeasure")
        spec += evaluate(ttest, predictTest, "specificity")
    
    acc /=9
    prec /=9
    rec /=9
    fmeas /=9
    spec/=9
    plt.show(2)
    print ("Mean Accuracy : " + str(acc))
    print ("Mean Precicion : " + str(prec))
    print ("Mean Recall : " + str(rec))
    print ("Mean Fmeasure : " + str(fmeas))
    print("Mean Sensitivity : " + str(rec))
    print("Mean Specificity : " + str(spec))
    ans = answer()

if(ans == 'n'):
    print('Goodbye!')