# Instructions
Calculate the Hamming Distance between two DNA strands.

Your body is made up of cells that contain DNA. Those cells regularly wear out and need replacing, which they achieve by dividing into daughter cells. In fact, the average human body experiences about 10 quadrillion cell divisions in a lifetime!

When cells divide, their DNA replicates too. Sometimes during this process mistakes happen and single pieces of DNA get encoded with the incorrect information. If we compare two strands of DNA and count the differences between them we can see how many mistakes occurred. This is known as the "Hamming Distance".

We read DNA using the letters C,A,G and T. Two strands might look like this:

![image](https://user-images.githubusercontent.com/54405665/219110205-deccb878-28a2-419e-9bad-c06373688c96.png)

They have 7 differences, and therefore the Hamming Distance is 7.

The Hamming Distance is useful for lots of things in science, not just biology, so it's a nice phrase to be familiar with :)

The Hamming distance is only defined for sequences of equal length, so an attempt to calculate it between sequences of different lengths should not work. The general handling of this situation (e.g., raising an exception vs returning a special value) may differ between languages.

This is the first exercise with tests that require you to throw an Exception. Exceptions are typically thrown to indicate that a program has encountered an unexpected input or state.

We use JUnit's ExpectedException rule throughout the track to verify that the exceptions you throw are:

- instances of a specified Java type;
- (optionally) initialized with a specified message.
- 
