# Debt

Create the class Debt that has double-typed instance variables of balance and interestRate. The balance and the interest rate are passed to the constructor as parameters public Debt(double initialBalance, double initialInterestRate).

In addition, create the methods public void printBalance() and public void waitOneYear() for the class. The method printBalance prints the current balance, and the waitOneYear method grows the debt amount.

The debt is increased by multiplying the balance by the interest rate.

The class should do the following:

```
public class MainProgram {
    public static void main(String[] args) {

        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}
```
The example above illustrates the development of a mortgage with an interest rate of one percent.

Prints:

```
120000.0
121200.0
147887.0328416936
```

When you've managed to get the program to work, check the previous example with the early 1900s recession interest rates as well.

Once you get the program to work, try out the previous example with the interest rates of the early 1990s recession when the interest rates were as high as 15-20% - try swapping the interest rate in the example above with 1.20 and see what happens.

