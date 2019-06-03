import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.decomposition import PCA
import matplotlib.pyplot as plt

data = np.load("mnist_49.npz")
x = data['x']
t = data['t']
trainScore = 0
testScore = 0
numComponents = [1, 2, 5, 10, 20, 30, 40, 50, 100, 200]
for i in range(10):
    print("Fold "+str(i)+" running...")
    xtrain , xtest , ttrain , ttest = train_test_split( x, t, test_size=0.2)
    model = GaussianNB()
    network = model.fit(xtrain,np.ravel(ttrain))
    trainScore += network.score(xtrain,ttrain)
    testScore += network.score(xtest,ttest)

trainScore /=10
testScore /=10
print("Mean Accuracy for the train set : "+str(trainScore))
print("Mean Accuracy for the test set : "+str(testScore))

trainPcaScore = []
testPcaScore = []
trainPca=0
testPca=0

for j in range(len(numComponents)):
    pca = PCA(n_components = numComponents[j])
    x_pca = pca.fit_transform(x)
    trainPca=0
    testPca=0
    print("Running for Pca components : "+str(numComponents[j]))
    for i in range(10):
        xtrain , xtest , ttrain , ttest = train_test_split( x_pca, t, test_size=0.2)
        model = GaussianNB()
        network = model.fit(xtrain,np.ravel(ttrain))
        trainPca += network.score(xtrain,ttrain)
        testPca += network.score(xtest,ttest)
    trainPcaScore.append(trainPca/10)
    testPcaScore.append(testPca/10)

plt.figure(1)
plt.xlabel("PCA Components")
plt.ylabel("Mean Accuracy")
plt.plot(trainPcaScore[:] , 'r-' , label="Train Set")
plt.plot(testPcaScore[:] , 'b-' , label="Test Set")
w = np.array([0,1,2,3,4,5,6,7,8,9])
plt.xticks(w, numComponents)
plt.legend()
plt.show(1)
