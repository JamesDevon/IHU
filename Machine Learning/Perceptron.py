# -*- coding: utf-8 -*-
"""
Created on Thu Apr  4 04:46:18 2019
@author: James
"""
# -*- coding: utf-8 -*-
from pandas import read_csv
import matplotlib.pyplot as plt
import numpy as np
from sklearn.model_selection import train_test_split

    #Voids
def perceptron(x , t, epoxes , bhma):
    p = 0
    #Randomly initializing w
    w = np.random.rand(5,1)
    while (p < epoxes) :
        #Flag to check if any change is made so the algorithm can stop if not
        flag = True
        for j in range(len(x)):
            u = np.matmul(x[j,:],w)
            if(u[0]<0):
                y=0
            else:
                y=1
            if(t[j]!=y):
                for i in range(len(w)):
                    #Perceptron training algorithm
                    w[i] = w[i] + bhma*(t[j]-y)*x[j,i]
                flag = False
        p+=1
        if(flag):
            break
    print("Εποχές που χρειάστηκαν : ", p)
    return w

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
    plt.xlabel("x") 
    plt.ylabel("y")
    plt.plot(xtrain[:,0] , xtrain[:,2] , 'bo' , label="Train Set")
    plt.plot(xtest[:,0] , xtest[:,2] , 'ro', label="Test Set" )
    plt.legend()
    plt.show(2)
    
    ttrain1 = (len(ttrain),1)
    ttrain1 = np.zeros(ttrain1)
    ttest1 = (len(ttest),1)
    ttest1 = np.zeros(ttest1)
    #Creation of -1 | 1 Array
    for j in range(len(ttrain)):
        ttrain1[j] = (ttrain[j]*2)-1
    for j in range(len(ttest)):
        ttest1[j]= (ttest[j]*2)-1
        
    maxEpoxes = int(input("Δώσε μέγιστο αριθμό εποχών : "))
    bhma = float(input("Δώσε βήμα εκπαίδευσης : "))
    #Creating a perceptron model
    w = perceptron(xtrain , ttrain , maxEpoxes , bhma )
    
    ytrain = xtrain*w
    predicttrain = np.zeros(ytrain.shape)
    for j in range(len(ytrain)):
        #Calculating Predictions for Train Set
        if(ytrain[j]<0):
            predicttrain[j] = 0
        else:
            predicttrain[j] = 1
            
    plt.figure(3)
    plt.plot(ttrain[:] , 'b.')
    plt.plot(predicttrain[:] , 'ro' , fillstyle='none' , markersize=9.5)
    plt.show(3)
    
    ytest = xtest*w
    predicttest = ytest.shape
    predicttest = np.zeros(predicttest)
    for j in range(len(ytest)):
        #Calculating Predictions for Test Set
        if(ytest[j]<0):
            predicttest[j] = 0
        else:
            predicttest[j] = 1
    
    plt.figure(4)
    plt.plot(ttest[:] , 'b.')
    plt.plot(predicttest[:] , 'ro' , fillstyle='none' , markersize=9.5)
    plt.show(4)

    plt.figure(5)
    #K-folds Cross-validation method
    for i in range(9):
        xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1, random_state=i)
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
    
    #User inserts εποχές and β
    maxEpoxes = int(input("Δώσε μέγιστο αριθμό εποχών : "))
    bhma = float(input("Δώσε βήμα εκπαίδευσης : "))
    
    
    plt.figure(6)
    for i in range(9):
        #Seperating to Train , Test set with Train_Test_Split
        xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.1,random_state=i)
        ttrain1 = (len(ttrain),1)
        ttrain1 = np.zeros(ttrain1)
        ttest1 = (len(ttest),1)
        ttest1 = np.zeros(ttest1)
        #Creation of -1 | 1 Array
        for j in range(len(ttrain)):
            ttrain1[j] = (ttrain[j]*2)-1
        for j in range(len(ttest)):
            ttest1[j]= (ttest[j]*2)-1
            
        #Perceptron
        Ptrain = len(xtrain)
        Ptest = len(xtest)
        u = (Ptest,1)
        u = np.zeros(u)
        w = perceptron(xtrain , ttrain , maxEpoxes , bhma )
        u = np.matmul(xtest,w)

        predicttest = u.shape
        predicttest = np.zeros(predicttest)
        #Calculating Predictions for Test Set
        for j in range(len(u)):
            if(u[j]<0):
                predicttest[j] = 0
            else:
                predicttest[j] = 1

        ytrain = np.matmul(xtrain,w)
        predicttrain = ytrain.shape
        predicttrain = np.zeros(predicttrain)
        #Calculating Predictions for Train Set
        for j in range(len(ytrain)):
            if(ytrain[j]<0):
                predicttrain[j] = 0
            else:
                predicttrain[j] = 1
        #Criterion evaluation
        acc += evaluate(ttest , predicttest, "accuracy")
        prec += evaluate(ttest, predicttest, "precicion")
        rec += evaluate(ttest, predicttest, "recall")
        fmeas += evaluate(ttest,predicttest, "fmeasure")
        spec += evaluate(ttest, predicttest, "specificity")

        plt.subplot(3,3,i+1)
        plt.plot(ttest[:] , 'b.')
        plt.plot(predicttest[:] , 'ro' , fillstyle='none' , markersize=9.5)

    plt.show(6)
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