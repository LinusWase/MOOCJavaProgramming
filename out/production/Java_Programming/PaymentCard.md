# Payment Card (6 parts)
At the University of Helsinki student canteen, i.e. Unicafe, students pay for their lunch using a payment card. The final PaymentCard will look like the following as a class diagram:

<pre>
PaymentCard
-----------
- balance:double
----------------
+ Paymentcard(double)
+ eatAffordably(): void
+ eatHeartily(): void
+ addMoney(): void
+ toString(): String
</pre>

In this exercise series, a class called PaymentCard is created which aims to mimic Unicafe's payment process

## Part 1: The class template
The project will include two code files:

The exercise template comes with a code file called Main, which contains the main method.

Add a new class to the project called PaymentCard. Here's how to add a new class: On the left side of the screen is the list of projects. Right-click on the project name. Select New and Java Class from the drop-down menu. Name the class as "PaymentCard".

First, create the PaymentCard object's constructor, which is passed the opening balance of the card, and which then stores that balance in the object's internal variable. Then, write the toString method, which will return the card's balance in the form "The card has a balance of X euros".

The following is the template of the PaymentCard class:

```
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
    }

    public String toString() {
        // write code here
    }
}
```

The following main program tests the class:
```
public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);
    }
}
```
The program should print the following:
> The card has a balance of 50.0 euros

## Part 2: Making transactions
Complement the PaymentCard class with the following methods:

```
public void eatAffordably() {
    // write code here
}

public void eatHeartily() {
    // write code here
}
```
The method eatAffordably should reduce the card's balance by € 2.60, and the method eatHeartily should reduce the card's balance by € 4.60.

The following main program tests the class:

```
public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);
    }
}
```
The program should print approximately the following:
<pre>
The card has a balance of 50.0 euros
The card has a balance of 47.4 euros
The card has a balance of 40.199999999999996 euros
</pre>

## Part 4: Topping up the card

Add the following method to the PaymentCard class:

```
public void addMoney(double amount) {
    // write code here
}
```
The purpose of the method is to increase the card's balance by the amount of money given as a parameter. However, the card's balance may not exceed 150 euros. As such, if the amount to be topped up exceeds this limit, the balance should, in any case, become exactly 150 euros.

The following main program tests the class:

```
public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(10);
        System.out.println(card);

        card.addMoney(15);
        System.out.println(card);

        card.addMoney(10);
        System.out.println(card);

        card.addMoney(200);
        System.out.println(card);
    }
}
```
The program should print the following:
<pre>
The card has a balance of 10.0 euros
The card has a balance of 25.0 euros
The card has a balance of 35.0 euros
The card has a balance of 150.0 euros
</pre>

## Part 5: Topping up the card with a negative value
Change the addMoney method further, so that if there is an attempt to top it up with a negative amount, the value on the card will not change.

The following main program tests the class:

```
public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(10);
        System.out.println("Paul: " + card);
        card.addMoney(-15);
        System.out.println("Paul: " + card);
    }
}
```
The program should print the following:

<pre>
Paul: The card has a balance of 10.0 euros
Paul: The card has a balance of 10.0 euros
</pre>

## Part 6: Multiple cards
Write code in the main method of the MainProgram class that contains the following sequence of events:


- Create Paul's card. The opening balance of the card is 20 euros
- Create Matt's card. The opening balance of the card is 30 euros
- Paul eats heartily
- Matt eats affordably
- The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
- Paul tops up 20 euros
- Matt eats heartily
- The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
- Paul eats affordably
- Paul eats affordably
- Matt tops up 50 euros
- The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)

The main program's template is as follows:
```
public class Main {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // write code here
    }
}
```
The program should produce the following print output:
<pre>
Paul: The card has a balance of 15.4 euros
Matt: The card has a balance of 27.4 euros
Paul: The card has a balance of 35.4 euros
Matt: The card has a balance of 22.799999999999997 euros
Paul: The card has a balance of 30.199999999999996 euros
Matt: The card has a balance of 72.8 euros
</pre>
