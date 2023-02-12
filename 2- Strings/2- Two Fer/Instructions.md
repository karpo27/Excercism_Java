# Instructions
Two-fer or 2-fer is short for two for one. One for you and one for me.

Given a name, return a string with the message:

![image](https://user-images.githubusercontent.com/54405665/218329770-792d6b00-10e7-4770-90b2-1a0484e61c40.png)

Where "name" is the given name.

However, if the name is missing, return the string:

![image](https://user-images.githubusercontent.com/54405665/218329778-452f8bb2-3b32-4edf-8864-d88a1eb1c93d.png)

Here are some examples:

![image](https://user-images.githubusercontent.com/54405665/218329792-a0d61593-bbcb-49d5-bd0d-1d57bd17a296.png)

Before you start, make sure you understand how to write code that can pass the test cases. For more context, check out this tutorial.

Most Java exercises include multiple test cases. These cases are structured to support a useful process known as test-driven development (TDD). TDD involves repeating a structured cycle that helps programmers build complex functionality piece by piece rather than all at once. That cycle can be described as follows:

- Add a test that describes one piece of desired functionality your code is currently missing.
- Run the tests to verify that this newly-added test fails.
- Update your existing code until:
  - All the old tests continue to pass;
  - The new test also passes.
- Clean up your code, making sure that all tests continue to pass. This typically involves renaming variables, removing duplicated chunks of logic, removing leftover logging, etc.
- Return to step 1 until all desired functionality has been built!

The test files in this track contain all the tests your solution should pass to be considered valid. That doesn't immediately seem to be compatible with the cycle described above, in which tests are written one by one. However, the tool that we use to write our tests, JUnit, provides an @Ignore annotation that can be used to temporarily skip an already-written test. Using this annotation, we make sure that the test files we deliver to you satisfy the following rules:

- The first test in any test file is not skipped by default.
- All but the first test in any test file are skipped by default.
- 
This allows you to simulate the TDD cycle by following these slightly-modified steps:

- 1) Run the tests to verify that at most one test currently fails.
- 2) Update your existing code until all the non-skipped tests pass.
- 3) Clean up your code, making sure that all non-skipped tests continue to pass.
- 4) Remove the topmost @Ignore annotation in the test file.
- 5) Return to step 1 until no tests are skipped and all tests pass!
- 
