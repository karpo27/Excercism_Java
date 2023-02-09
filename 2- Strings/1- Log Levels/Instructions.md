# Instructions
In this exercise you'll be processing log-lines.

Each log line is a string formatted as follows:

![image](https://user-images.githubusercontent.com/54405665/217834388-8db53b01-3ed7-4577-9b2c-d8ae49e14470.png)

There are three different log levels:

- INFO
- WARNING
- ERROR
  
You have three tasks, each of which will take a log line and ask you to do something with it.

# 1. Get message from a log line
Implement the (static) LogLevels.message() method to return a log line's message:

![image](https://user-images.githubusercontent.com/54405665/217833897-5292754a-96be-42c5-8397-a894fd403cb2.png)

Any leading or trailing white space should be removed:

  ![image](https://user-images.githubusercontent.com/54405665/217833998-bed38e27-a39b-46a2-87c6-5aeb794668f4.png)
  
# 2. Get log level from a log line
Implement the (static) LogLevels.logLevel() method to return a log line's log level, which should be returned in lowercase:
  
  ![image](https://user-images.githubusercontent.com/54405665/217834101-9e638e1f-359a-4a54-94fa-e2c25ed3be01.png)

  # 3. Reformat a log line
Implement the (static) LogLevels.reformat() method that reformats the log line, putting the message first and the log level after it in parentheses:
  
  ![image](https://user-images.githubusercontent.com/54405665/217834152-5b6adf30-4539-462e-93c7-ba4691e6fdd8.png)
