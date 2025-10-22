# TacoBoxes (2 parts)
In the exercise template you'll find Interface TacoBox ready for your use. It has the following methods:

- the method int tacosRemaining() return the number of tacos remaining in the box.

- the method void eat() reduces the number of tacos remaining by one. The number of tacos remaining can't become 
negative.

```
public interface TacoBox {
    int tacosRemaining();
    void eat();
}
```

## Part 1: Triple taco box
Implement the class TripleTacoBox, that implements the TacoBox interface. TripleTacobox has a constructor with no parameters. TripleTacobox has an object variable tacos which is initialized at 3 when the constructor is called.

## Part 2: Custom taco box
Implement the class CustomTacoBox, that implements the TacoBox interface. CustomTacoBox has a constructor with one parameter defining the initial number of tacos in the box(int tacos).
