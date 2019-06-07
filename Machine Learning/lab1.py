# -*- coding: utf-8 -*-
from pandas import read_csv
import matplotlib.pyplot as plt
import numpy as np
from sklearn.model_selection import train_test_split

#Voids
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
#voids/

#main
data = read_csv('http://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data', header=None).values
numberOfAttributes = len(data[1])
numberOfPatterns = len(data)
x = data[:,0:4]
t = np.zeros(numberOfPatterns)
ans = 'y'
while(ans == 'y' ):
    plt.figure(1)
    plt.plot( x[0:50,0] , x[0:50,2] , 'bo', label="Iris Setosa")
    plt.plot( x[50:100,0] , x[50:100,2] , 'r*' , label="Iris Versicolor")
    plt.plot( x[100:150,0] , x[100:150,2] , 'g+', label="Iris Virginica")
    plt.legend()
    plt.show(1)
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
    #Manual Seperation into Train and Test set
    xtrain = np.vstack((x[0:40,:],x[50:90,:],x[100:140,:]))
    ttrain = np.hstack((t[0:40],t[50:90],t[100:140]))
    xtest = np.vstack((x[40:50,:],x[90:100,:],x[140:150,:]))
    ttest = np.hstack((t[40:50],t[90:100],t[140:150]))

    plt.figure(2)
    plt.xlabel("x") 
    plt.ylabel("y")
    plt.plot(xtrain[:,0] , xtrain[:,2] , 'bo' , label="Train Set")
    plt.plot(xtest[:,0] , xtest[:,2] , 'ro' ,label="Test Set")
    plt.legend()
    plt.show(2)
    
    
    plt.figure(3)
    #K-folds Cross-validation Method
    for i in range(9):
        xtrain , xtest , ttrain , ttest = train_test_split(x,t,test_size=0.1)
        plt.subplot(3,3,i+1)
        plt.plot(xtrain[:,0] , xtrain[:,2] , 'bo' )
        plt.xlabel("x") 
        plt.ylabel("y")
        plt.title("Fold "+str(i))
        plt.plot(xtest[:,0] , xtest[:,2] , 'ro' )
    plt.show(3)
    ans = answer()
    
if(ans == 'n'):
    print('goodbye')
#main/