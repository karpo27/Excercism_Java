# Instructions
In this exercise you will be doing some more work on remote control cars.

An experimental car has been developed and the test track needs to be adapted to handle both production and experimental models. The two types of car have already been built and you need to find a way to deal with them both on the test track.

In addition, production cars are beginning to have some success. The team boss is keen to maintain the competitive spirit by publishing a ranking of the production cars.

## 1. Enable cars to be driven on the same test track
Please add a method to the RemoteControlCar interface to encapsulate the behavior of drive() for the two types of car.

![image](https://user-images.githubusercontent.com/54405665/221872152-a50d43ee-8c0c-4eaa-bebb-3327a08b74e9.png)

## 2. Enable the distance travelled by different models on the test track to be compared
Please add a method to the RemoteControlCar interface to encapsulate the behavior of the getDistanceTravelled() method for the two types of car. Notice that the Experimental model has a different speed than the Production model

![image](https://user-images.githubusercontent.com/54405665/221872242-240f2140-b25c-4649-b97f-ad633465578e.png)

## 3. Allow the production cars to be ranked
Please implement the Comparable<T> interface in the ProductionRemoteControlCar class. The default sort order for cars should be ascending order of victories.

Implement the static TestTrack.getRankedCars() to return the cars passed in, sorted in ascending order of number of victories.
  
![image](https://user-images.githubusercontent.com/54405665/221872315-ed5ddca5-a8c8-4565-865f-733016644083.png)

  
