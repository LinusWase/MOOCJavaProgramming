# Leap year
A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.

Write a program that reads a year from the user, and checks whether or not it is a leap year.

>  Give a year: 2011 <br>
The year is not a leap year.

> Give a year: 2012 <br>
The year is a leap year.

> Give a year: 1800 <br>
The year is not a leap year.

> Give a year: 2000 <br>
The year is a leap year.

Hint 1: The divisibility by a particular number can be checked using the modulo operator, aka %, in the following way.
```
int number = 5;

if (number % 5 == 0) {
    System.out.println("The number is divisible by five!");
}

if (number % 6 != 0) {
    System.out.println("The number is not divisible by six!")
}
```
> The number is divisible by five! <br>
The number is not divisible by six!

Hint 2: Think of the problem as a chain of if, else if, else if, ... comparisons, and start building the program from a situation in which you can be certain that the year is not a leap year.

```
Scanner reader = new Scanner(System.in);
int number = Integer.valueOf(reader.nextLine());

if (number % 4 != 0) {
    System.out.println("The year is not a leap year.");
} else if (...) {
    ...
} ...
```