# Summation
Expand the method sum in the exercise template so that it calculates and returns the sum of the numbers that are given as the parameters.

Create the method using the following structure:

```
public static int sum(int number1, int number2, int number3, int number4) {
    // write your code here
    // remember to include return (at the end)!
}

public static void main(String[] args) {
    int answer = sum(4, 3, 6, 1);
    System.out.println("Sum: " + answer);
}
```

The output of the program:
>Sum: 14

__NB:__ when an exercise describes a method that should return something, this means that the type of the return value 
must be declared in the method definition, and that the method contains a return command that returns the wanted data. The method itself will print nothing (i.e. will not use the command System.out.println) - that task is left to the method caller, which in this case is the main program.