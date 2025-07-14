Day 6: Java this Keyword 

💡 What is this keyword?

1."this" is a reference to the current object of a class.
2.It is used when class variables and method/constructor parameters have the same name.
3."this" helps to differentiate between the class variable and parameter.

________________________________________________________________________________________________________________________________________________

Example 1: Using this to refer to class variables

public class Student {
  String name;

  // Constructor with parameter name
  public Student(String name) {
    this.name = name;  // this.name refers to class variable
  }

  public void display() {
    System.out.println("Student name is: " + this.name);
  }

  public static void main(String[] args) {
    Student s1 = new Student("Shambhavi");
    s1.display();
  }
}

Output: Student name is: Shambhavi
________________________________________________________________________________________________________________________________________________

Example 2: Calling one constructor from another using this():

public class Car {
  int year;
  String model;

  public Car(String model) {
    this(2020, model); // Call another constructor
  }

  public Car(int year, String model) {
    this.year = year;
    this.model = model;
  }

  public void printInfo() {
    System.out.println(year +" "+ model);
  }

  public static void main(String[] args) {
    Car c1 = new Car("Corvette");
    Car c2 = new Car(1969, "Mustang");
    c1.printInfo();
    c2.printInfo();
  }
}
Output:
2020 Corvette
1969 Mustang

Accessing class variables using this
this.name   // refers to class variable name
this.year   // refers to class variable year

 Key Points to Remember
1.Use this.variableName when a method/constructor parameter hides a class variable.
2.this() can be used to call another constructor of the same class (must be the first line in the constructor).
3.this improves code clarity when variables have the same name.

