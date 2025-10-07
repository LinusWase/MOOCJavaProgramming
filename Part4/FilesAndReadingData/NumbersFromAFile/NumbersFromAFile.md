# Printing a Specified File
Write a program that prompts the user for a filename, as well as the upper and lower bounds for the accepted range of numbers. Then the program reads the numbers contained in the file (each number is on its own line) and only accounts for the numbers which are inside the given range. Finally, the program should print the number of numbers that were inside the given range.

You can convert a string-type integer read from a file into a proper integer using the command Integer.valueOf (just as when handling input from a user).

<pre>
File? numbers-1.txt
Lower bound? 15
Upper bound? 20
Numbers: 2
</pre>

<pre>
File? numbers-1.txt
Lower bound? 0
Upper bound? 300
Numbers: 4
</pre>

__NB!__ The exercise template comes with two files, numbers-1.txt and numbers-2.txt that have the following contents. 
Do not change the contents of these files.

numbers-1.txt:

<pre>
300
9
20
15
</pre>

numbers-2.txt:

<pre>
123
-5
12
67
-300
1902
</pre>