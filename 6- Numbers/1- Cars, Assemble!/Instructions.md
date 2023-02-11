# Instructions
In this exercise you'll be writing code to analyze the production of an assembly line in a car factory. The assembly line's speed can range from 0 (off) to 10 (maximum).

At its lowest speed (1), 221 cars are produced each hour. The production increases linearly with the speed. So with the speed set to 4, it should produce 4 * 221 = 884 cars per hour. However, higher speeds increase the likelihood that faulty cars are produced, which then have to be discarded. The following table shows how speed influences the success rate:

- 1 to 4: 100% success rate.
- 5 to 8: 90% success rate.
- 9: 80% success rate.
- 10: 77% success rate.

You have two tasks.

# 1. Calculate the production rate per hour
Implement the CarsAssemble.productionRatePerHour() method to calculate the assembly line's production rate per hour, taking into account its current assembly line's speed :

![image](https://user-images.githubusercontent.com/54405665/218283186-231bd831-9f5d-4793-889b-5d5a7e928d0a.png)

Note that the value returned is a double.

# 2. Calculate the number of working items produced per minute
Implement the CarsAssemble.workingItemsPerMinute() method to calculate how many working cars are produced per minute:

![image](https://user-images.githubusercontent.com/54405665/218283190-271063f5-e554-4808-b0b3-d3a40f4c022e.png)

