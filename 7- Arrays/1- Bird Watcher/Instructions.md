# Instructions
You're an avid bird watcher that keeps track of how many birds have visited your garden in the last seven days.

You have six tasks, all dealing with the numbers of birds that visited your garden.

# 1. Check what the counts were last week
For comparison purposes, you always keep a copy of last week's counts nearby, which were: 0, 2, 5, 3, 7, 8 and 4. Implement the BirdWatcher.getLastWeek() method that returns last week's counts:

![image](https://user-images.githubusercontent.com/54405665/218312205-d8c586c2-65b9-4260-a0b1-245ed85aae66.png)

# 2. Check how many birds visited today
Implement the BirdWatcher.getToday() method to return how many birds visited your garden today. The bird counts are ordered by day, with the first element being the count of the oldest day, and the last element being today's count.

![image](https://user-images.githubusercontent.com/54405665/218312224-4937827f-914e-414e-a784-06a9321b011b.png)

# 3. Increment today's count
Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:

![image](https://user-images.githubusercontent.com/54405665/218312241-de6366c1-1417-4498-8a63-8043d3ec0b76.png)

# 4. Check if there was a day with no visiting birds
Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if there was a day at which zero birds visited the garden; otherwise, return false:

![image](https://user-images.githubusercontent.com/54405665/218312259-7c462f6f-77cb-4d90-beea-ad7fe7fe964d.png)

# 5. Calculate the number of visiting birds for the first number of days
Implement the BirdWatcher.getCountForFirstDays() method that returns the number of birds that have visited your garden from the start of the week, but limit the count to the specified number of days from the start of the week.

![image](https://user-images.githubusercontent.com/54405665/218312267-f13e71b8-8332-4a0f-bb7d-31ed39a5305c.png)

# 6. Calculate the number of busy days
Some days are busier that others. A busy day is one where five or more birds have visited your garden. Implement the BirdWatcher.getBusyDays() method to return the number of busy days:

![image](https://user-images.githubusercontent.com/54405665/218312278-2eb58f2b-1c7d-4462-8a46-cd0787db00fc.png)

