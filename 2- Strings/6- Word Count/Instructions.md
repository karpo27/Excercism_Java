# Instructions
Given a phrase, count the occurrences of each word in that phrase.

For the purposes of this exercise you can expect that a word will always be one of:

- A number composed of one or more ASCII digits (ie "0" or "1234") OR
- A simple word composed of one or more ASCII letters (ie "a" or "they") OR
- A contraction of two simple words joined by a single apostrophe (ie "it's" or "they're")

When counting words you can assume the following rules:

- The count is case insensitive (ie "You", "you", and "YOU" are 3 uses of the same word)
- The count is unordered; the tests will ignore how words and counts are ordered
- Other than the apostrophe in a contraction all forms of punctuation are ignored
- The words can be separated by any form of whitespace (ie "\t", "\n", " ")

For example, for the phrase "That's the password: 'PASSWORD 123'!", cried the Special Agent.\nSo I fled. the count would be:

![image](https://user-images.githubusercontent.com/54405665/224980367-4d587524-21f6-46dd-a2de-f7becf95d8be.png)

Since this exercise has difficulty 5 it doesn't come with any starter implementation. This is so that you get to practice creating classes and methods which is an important part of programming in Java. It does mean that when you first try to run the tests, they won't compile. They will give you an error similar to:

![image](https://user-images.githubusercontent.com/54405665/224981365-4a52ba59-a24c-446f-b8e1-5845b8d635f2.png)
 
 This error occurs because the test refers to a class that hasn't been created yet (ExerciseClassName). To resolve the error you need to add a file matching the class name in the error to the src/main/java directory. For example, for the error above you would add a file called ExerciseClassName.java.

When you try to run the tests again you will get slightly different errors. You might get an error similar to:

![image](https://user-images.githubusercontent.com/54405665/224981466-8fe57c6d-7fbb-4e2f-9da5-2aa6170b855d.png)
  
  This error means that you need to add a constructor to your new class. If you don't add a constructor, Java will add a default one for you. This default constructor takes no arguments. So if the tests expect your class to have a constructor which takes arguments, then you need to create this constructor yourself. In the example above you could add:
  
  ![image](https://user-images.githubusercontent.com/54405665/224980558-74a5c8c3-f222-4981-b340-578023616e78.png)

That should make the error go away, though you might need to add some more code to your constructor to make the test pass!

You might also get an error similar to:

![image](https://user-images.githubusercontent.com/54405665/224980612-85e838a6-47cb-4962-bdf6-d6275a9d4d45.png)

This error means that you need to add a method called someMethod to your new class. In the example above you would add:

![image](https://user-images.githubusercontent.com/54405665/224980662-6eaa9261-986e-428d-91b7-7a8659d932e7.png)

Make sure the return type matches what the test is expecting. You can find out which return type it should have by looking at the type of object it's being compared to in the tests. Or you could set your method to return some random type (e.g. void), and run the tests again. The new error should tell you which type it's expecting.

After having resolved these errors you should be ready to start making the tests pass!
