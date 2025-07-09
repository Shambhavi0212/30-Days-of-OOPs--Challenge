Day 4: Java Class Methods - What I Learned
What are class methods?
Methods are functions written inside a class. They define actions that the class or its objects can perform.

Example:

public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }
}
To call a method, we should write its name followed by parentheses:
myMethod();
Calling methods inside main
We can call a method from main like this:


public static void main(String[] args) {
  myMethod();
}


Static vs public methods:

1.A static method can be called without creating an object of the class.
2.A public method requires you to create an object of the class to call it.

Example:
public class Main {
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  public static void main(String[] args) {
    myStaticMethod();
    Main myObj = new Main();
    myObj.myPublicMethod();
  }
}
________________________________________________________________________________________________________________________________________________
Accessing methods with an object :
We can create an object and call its methods using the dot operator.

Example:

Main myCar = new Main();
myCar.fullThrottle();
myCar.speed(200);
fullThrottle() prints "The car is going as fast as it can!"

speed(200) prints "Max speed is: 200"

Using multiple classes
It is a good practice to create objects and access methods from another class.


Example:
Main.java contains the methods.
Second.java creates the object and calls the methods.
Compile and run:

javac Main.java
javac Second.java
java Second

Output:
The car is going as fast as it can!
Max speed is: 200
Key points to remember
File name and class name should match (Main.java for Main class).

The dot . operator is used to access attributes and methods of an object.

Methods can take parameters, like speed(int maxSpeed).