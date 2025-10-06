# Last in list
In the exercise template there is a program that reads inputs from the user and adds them to a list. Reading is stopped once the user enters an empty string.

Your task is to modify the method to print the last read value after it stops reading. Print the value that was read last from the list. Use the method that tells the size of a list to help you.

<pre>
Tom
Emma
Alex
Mary

Mary
</pre>

<pre>
Juno
Elizabeth
Mason
Irene
Olivia
Liam
Ida
Christopher
Mark
Sylvester
Oscar

Oscar
</pre>

*Used list.getLast() with JDK 22, but list.get(list.size()-1) with JavaSE-1.8*