# Instructions
In this exercise, you'll be implementing rules for calculating the total salary of a employee in a month. The International Siderurgy Company (ISC) needs help to calculate the salary for the employees, given that different factors can alter the final wage value for each employee.

You have three tasks and you should use the ternary operator instead of if/else statements to implement them.

## 1. Determine the salary multiplier
Implement the multiplierPerDaysSkipped method that returns the salary multiplier based on the number of days the employee skipped the job. A 15% penalty is applied if more than five days were skipped.

![image](https://user-images.githubusercontent.com/54405665/221181334-4d773798-b216-4f81-a3b9-4e480b34ebe2.png)

## 2. Calculate the bonus for products sold
Implement the multiplierPerProductsSold and bonusForProductSold methods. The ISC pays ten monetary units for each product sold, but if the employee sold more than twenty products, the multiplier is improved to thirteen. multiplierPerProductsSold should decide which multiplier is applied and bonusForProductSold should return the total bonus in monetary units.

![image](https://user-images.githubusercontent.com/54405665/221181378-6d8f44ea-e659-4e5c-89d8-c2a24bbdd2db.png)

## 3. Calculate the final salary for the employee
Implement the finalSalary method. It should be able to multiply the base salary of 1000.00 by the salary multiplier and sum the bonus and return the result, but keep in mind that salaries should be capped at 2000.00;

![image](https://user-images.githubusercontent.com/54405665/221181424-07946db8-e993-4fc8-a635-0ede456d7925.png)

