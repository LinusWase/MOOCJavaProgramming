# Enum and Iterator (4 parts)
Let's implement a program for managing employee data of a small company.

## Part 1: Education
Make an enumerated type (enum) Education. It should have the enumerators PHD (Doctoral degree), MA (Masters degree), BA (Bachelors degree) and HS (High School diploma).

## Part 2: Person
Make a class Person. The Person constructor takes a name and the education as parameters. A Person has a method public Education getEducation(), which returns the education of the person. A Person also has a toString -method which works as follows:

```
Person anna = new Person("Anna", Education.PHD);
System.out.println(anna);
```

> Anna, PHD

## Part 3: Employees
Make a class Employees. Employees -object contains a list of Person -objects. The class has a constructor which takes no parameters, and the following methods:

- public void add(Person personToAdd) adds the given person to the employees list

- public void add(List<Person> peopleToAdd) adds the given list of people to the employees list

- public void print() prints all employees

- public void print(Education education) prints the employees whose education matches the education given as a 
  parameter.

__NB:__ The print method of the Employees class must be implemented using an iterator!

## Part 4: Firing an employee
Make a method public void fire(Education education) for the Employees class. The method removes all employees whose education matches the education given as parameter from the employees list.

NB: Implement the method using an iterator!

See an example of using the class below:

```
Employees university = new Employees();
university.add(new Person("Petrus", Education.PHD));
university.add(new Person("Arto", Education.HS));
university.add(new Person("Elina", Education.PHD));

university.print();

university.fire(Education.HS);

System.out.println("==");

university.print();
```

Prints:

<pre>
Arto, HS
Elina, PHD

Petrus, PHD
Elina, PHD
</pre>