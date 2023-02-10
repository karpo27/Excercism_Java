# Instructions
In this exercise you will implement a partial set of utility routines to help a developer clean up SqueakyClean names.

In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name is comprised of zero or more letters and underscores.

In all cases the input string is guaranteed to be non-null. Note that the clean method should treat an empty string as valid.

# 1. Replace any spaces encountered with underscores
Implement the (static) SqueakyClean.clean() method to replace any spaces with underscores. This also applies to leading and trailing spaces.

![image](https://user-images.githubusercontent.com/54405665/218199132-28e8611b-6916-444e-94da-6864017b4bd7.png)

# 2. Replace control characters with the upper case string "CTRL"
Modify the (static) SqueakyClean.clean() method to replace control characters with the upper case string "CTRL".

![image](https://user-images.githubusercontent.com/54405665/218199174-8bfefed0-69f9-4033-b551-5c85255456a2.png)

# 3. Convert kebab-case to camelCase
Modify the (static) SqueakyClean.clean() method to convert kebab-case to camelCase.

![image](https://user-images.githubusercontent.com/54405665/218199207-f7d42ef7-35c2-46d4-b14b-08888e6a746c.png)

# 4. Omit characters that are not letters
Modify the (static) SqueakyClean.clean() method to omit any characters that are not letters.

![image](https://user-images.githubusercontent.com/54405665/218199238-e0084bae-0813-4282-a719-6c6d366ddc1a.png)

# 5. Omit Greek lower case letters
Modify the (static) SqueakyClean.clean() method to omit any Greek letters in the range 'α' to 'ω'.

![image](https://user-images.githubusercontent.com/54405665/218199286-1032436b-d009-4c99-aab5-973072b008da.png)

