# I owe you

Create a class called IOU which has the following methods:

- constructor public IOU() creates a new IOU

- public void setSum(String toWhom, double amount) saves the amount owed and the person owed to to the IOU.

- public double howMuchDoIOweTo(String toWhom) returns the amount owed to the person whose name is given as a 
parameter. If the person

cannot be found, it returns 0.

The class can be used like this:

```
IOU mattsIOU = new IOU();
mattsIOU.setSum("Arthur", 51.5);
mattsIOU.setSum("Michael", 30);

System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
```

The code above prints:
### Sample output

>51.5
>30.0

Be careful in situations, when a person does not owe anything to anyone.

__NB!__ The IOU does not care about old debt. When you set a new sum owed to a person when there is some money already 
owed to the same person, the old debt is forgotten.

```
IOU mattsIOU = new IOU();
mattsIOU.setSum("Arthur", 51.5);
mattsIOU.setSum("Arthur", 10.5);

System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
```

### Sample output

>10.5