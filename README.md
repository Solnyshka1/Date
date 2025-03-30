![image](https://github.com/user-attachments/assets/4e0bac64-3cfa-4e6a-9b88-1da328fca371)
About the Project
This project is about creating a Date class in Java. The class helps to work with dates, check if they are valid, find the difference between two dates, and sort them. It also includes a function to get the day of the week. The Main class is used to test everything.

Features of the Project:
1.Date Validation: Checks if a date is real, including leap years.
2.Sorting Dates: Implements Comparable<Date> so we can sort a list of dates.
3.Find Day of the Week: Uses LocalDate to get the correct day name.
4.Calculate Date Difference: Finds how many days are between two dates.
5.Update Dates: Changes the date while making sure it's valid.

Notes:
If you enter an invalid date (like February 30), the program will show an error.
Sorting is done in this order: year → month → day.
LocalDate and ChronoUnit are used to make calculations easier.
