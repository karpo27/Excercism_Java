# Instructions
In this exercise we will simulate the first turn of a Blackjack game.

You will receive two cards and will be able to see the face up card of the dealer. All cards are represented using a string such as "ace", "king", "three", "two", etc. The values of each card are:

![image](https://user-images.githubusercontent.com/54405665/218276154-e0c0457a-3952-4df9-9bac-ee0c65c0c2ab.png)

Note: Commonly, aces can take the value of 1 or 11 but for simplicity we will assume that they can only take the value of 11.

Depending on your two cards and the card of the dealer, there is a strategy for the first turn of the game, in which you have the following options:

![image](https://user-images.githubusercontent.com/54405665/218276162-c1d56495-589a-4d9e-9016-86f98f9343c2.png)

Although not optimal yet, you will follow the strategy your friend Alex has been developing, which is as follows:

Category: Large Hand

- If you have a pair of aces you must always split them.
- If you have a Blackjack (two cards that sum up to a value of 21), and the dealer does not have an ace, a figure or a ten then you automatically win. If the dealer does have any of those cards then you'll have to stand and wait for the reveal of the other card.

Category: Small Hand

- If your cards sum up to 17 or higher you should always stand.
- If your cards sum up to 11 or lower you should always hit.
- If your cards sum up to a value within the range [12, 16] you should always stand unless the dealer has a 7 or higher, in which case you should always hit.

The overall logic has already been implemented. You have four tasks:

## 1. Calculate the score of any given card.
Implement a function to calculate the numerical value of a card given its name using conditionals.

![image](https://user-images.githubusercontent.com/54405665/218276178-36632b14-2955-45eb-ba52-b9ecf493f567.png)

## 2. Determine if two cards make up a Blackjack.
Implement a function that returns true if two cards form a Blackjack, false otherwise.

![image](https://user-images.githubusercontent.com/54405665/218276193-ef7fb9d1-9fb2-49ad-9137-09201b94b01b.png)

## 3. Implement the decision logic for hand scores larger than 20 points.
Implement a function that returns the string representation of a decision given your cards. This function is only called if the handScore is larger than 20. It will receive 2 arguments: isBlackJack and dealerScore. It should implement the bulletpoints in the category "Large Hand" above.

![image](https://user-images.githubusercontent.com/54405665/218276200-c2c2be68-9320-46cf-973a-02ce10e9ed3c.png)

## 4. Implement the decision logic for hand scores with less than 21 points.
Implement a function that returns the string representation of a decision given your cards. This function is only called if the handScore is less than 21. It will receive 2 arguments: handScore and dealerScore. It should implement the bulletpoints in the category "Small Hand" above.

![image](https://user-images.githubusercontent.com/54405665/218276209-41ea3141-21a8-411b-b078-a72a607033ff.png)

