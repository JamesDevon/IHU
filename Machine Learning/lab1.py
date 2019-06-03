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
data.shape
x = data[:,0:4]
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
        
    plt.figure()
    for i in range(9):
        xtrain , xtest , ttrain , ttest = train_test_split(x,t,test_size=0.1)
        plt.subplot(3,3,i+1)
        plt.plot(xtrain[:,0] , xtrain[:,2] , 'bo' )
        plt.xlabel("x") 
        plt.ylabel("y")
        plt.title("Fold "+str(i))
        plt.plot(xtest[:,0] , xtest[:,2] , 'ro' )
        
    plt.show()
    ans = answer()
    
if(ans == 'n'):
    print('goodbye')
#main/



"""
Spyder Editor
This is a temporary script file.
"""

