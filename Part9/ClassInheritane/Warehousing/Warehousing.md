# Warehousing (7 parts)

The exercise template contains a class Warehouse, which has the following constructors and methods:

- public Warehouse(double capacity) - Creates an empty warehouse, which has the capacity provided as a parameter; an 
invalid capacity (<=0) creates a useless warehouse, with the the capacity 0.

- public double getBalance() - Returns the balance of the warehouse, i.e. the capacity which is taken up by the items 
in the warehouse.

- public double getCapacity() - Returns the total capacity of the warehouse (i.e. the one that was provided in the 
constructor).

- public double howMuchSpaceLeft() - Returns a value telling how much space is left in the warehouse.

- public void addToWarehouse(double amount) - Adds the desired amount to the warehouse; if the amount is negative, 
nothing changes, and if everything doesn't fit, then the warehouse is filled up and the rest is "thrown away" / "overflows".

- public double takeFromWarehouse(double amount) - Take the desired amount from the warehouse. The method returns 
much we actually get. If the desired amount is negative, nothing changes and we return 0. If the desired amount is greater than the amount the warehouse contains, we get all there is to take and the warehouse is emptied.

- public String toString() - Returns the state of the object represented as a string like this balance = 64.5, space 
left 123.5

In this exercise we build variations of a warehouse based on the Warehouse class.

## Part 1: Product warehouse, step 1

The class Warehouse handles the functions related to the amount of a product. Now we want a product name for the product and a way to handle the name. Let's write ProductWarehouse as a subclass of Warehouse! First, we'll just create a private object variable for the product name, a constructor, and a getter for the name field:

- public ProductWarehouse(String productName, double capacity) - Creates an empty product warehouse. The name of the 
product and the capacity of the warehouse are provided as parameters.

- public String getName() - Returns the name of the product.

Remind yourself of how a constructor can run the constructor of the superclass as its first action!

Example usage:

```
ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
juice.addToWarehouse(1000.0);
juice.takeFromWarehouse(11.3);
System.out.println(juice.getName()); // Juice
System.out.println(juice);           // balance = 988.7, space left 11.3
```

<pre>
Juice
balance = 988.7, space left 11.3
</pre>

## Part 2: Product warehouse, step 2
As we can see from the previous example, the toString() inherited by the ProductWarehouse object doesn't (obviously!) know anything about the product name. Something must be done! Let's also add a setter for the product name while we're at it:


- public void setName(String newName) - sets a new name for the product.

- public String toString() - Returns the state of the object represented as a string like this Juice: balance = 64.5, 
space left 123.5

The new toString() method could be written using the getters inherited from the superclass, which would give access to values of inherited, but still hidden fields. However, the superclass already has the desired functionality to provide a string representation of the warehouse state, so why bother recreating that functionality? Just take advantage of the inherited toString().

*Remind yourself of how to call an overridden method in a subclass!*

Usage example:

```
ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
juice.addToWarehouse(1000.0);
juice.takeFromWarehouse(11.3);
System.out.println(juice.getName()); // Juice
juice.addToWarehouse(1.0);
System.out.println(juice);           // Juice: balance = 989.7, space left 10.299999999999955
```

<pre>
Juice
Juice: balance = 989.7, space left 10.299999999999955
</pre>

## Part 3: Change History, step 1
Sometimes it might be useful to know how the inventory of a product changes over time: Is the inventory often low? Are we usually at the limit? Are the changes in inventory big or small? Etc. Thus we should give the ProductWarehouse class the ability to remember the changes in the amount of a product.

Let's begin by creating a tool that aids in the desired functionality.

The storing of the change history could of course have been done using an ArrayList<Double> object in the class ProductWarehouse, however, we want our own specialized tool for this purpose. The tool should be implemented by encapsulating the ArrayList<Double> object.

Public constructors and methods of the ChangeHistory class:

- public ChangeHistory() creates an empty ChangeHistory object.

- public void add(double status) adds provided status as the latest amount to remember in the change history.

- public void clear() empties the history.

- public String toString() returns the string representation of the change history. The string representation 
provided by the ArrayList class is sufficient.
