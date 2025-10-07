# Decreasing counter (3 parts)

This exercise consists of multiple parts. Each part corresponds to one exercise point.

The exercise template comes with a partially executed class decreasingCounter:

```
public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
    }

    // and the other methods go here
}
```

The following is an example of how the main program uses the decreasing counter:
```
public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
```
The program above should have the following print output.

<pre>
value: 10
value: 9
value: 8
</pre>

## Part 1: Implementation of the decrement() method

Implement the decrement() method in the class body in such a way that it decrements the value variable of the object it's being called on by one. Once you're done with the decrement() method, the main program of the previous example should work to produce the example output.

## Part 2: 
Implement the decrement() in such a way that the counter's value never becomes negative. This means that if the value of the counter is 0, it cannot be decremented. A conditional statement is useful here.

```
public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
```
Prints:
<pre>
value: 2
value: 1
value: 0
value: 0
</pre>