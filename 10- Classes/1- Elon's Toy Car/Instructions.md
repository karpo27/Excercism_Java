# Instructions
In this exercise you'll be playing around with a remote controlled car, which you've finally saved enough money for to buy.

Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers 20 meters and drains one percent of the battery.

The remote controlled car has a fancy LED display that shows two bits of information:

- The total distance it has driven, displayed as: "Driven <METERS> meters".
- The remaining battery charge, displayed as: "Battery at <PERCENTAGE>%".

  If the battery is at 0%, you can't drive the car anymore and the battery display will show "Battery empty".

You have six tasks, each of which will work with remote controlled car instances.

## 1. Buy a brand-new remote controlled car
Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance:
  
 ![image](https://user-images.githubusercontent.com/54405665/219771844-5c1df4a2-4828-4875-99be-f9aedf81f5d0.png)

  ## 2. Display the distance driven
Implement the ElonsToyCar.distanceDisplay() method to return the distance as displayed on the LED display:
  
  ![image](https://user-images.githubusercontent.com/54405665/219771947-f10b12e1-deef-419e-b586-cf3e027ff977.png)

## 3. Display the battery percentage
Implement the ElonsToyCar.batteryDisplay() method to return the battery percentage as displayed on the LED display:
  
  ![image](https://user-images.githubusercontent.com/54405665/219772047-f931175e-f66d-4668-8c29-b700ce8f749b.png)

## 4. Update the number of meters driven when driving
Implement the ElonsToyCar.drive() method that updates the number of meters driven:
  
  ![image](https://user-images.githubusercontent.com/54405665/219772229-15e1ad34-7307-439b-a921-03645117af00.png)

## 5. Update the battery percentage when driving
Update the ElonsToyCar.drive() method to update the battery percentage:
  
  ![image](https://user-images.githubusercontent.com/54405665/219772306-a1916beb-ba37-4e2d-84bd-76af20e74fd7.png)

## 6. Prevent driving when the battery is drained
Update the ElonsToyCar.drive() method to not increase the distance driven nor decrease the battery percentage when the battery is drained (at 0%):
  
  ![image](https://user-images.githubusercontent.com/54405665/219772408-5b8b8e5e-e165-4271-a6b4-0795eea8c1df.png)

  
