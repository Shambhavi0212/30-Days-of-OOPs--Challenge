📌 Day 2 : What I Learned Today — Java Classes and Objects

1.Java is an object-oriented programming language.
2.Everything in Java is based on classes (blueprints) and objects (real-world instances of classes).
3.A class defines attributes (variables) and methods (functions) that an object can have.
4.I learned how to create a class using the class keyword.
5.I practiced how to create an object from a class using the new keyword.
6.I learned to access attributes of an object using objectName.attributeName.
____________________________________________________________________________________________________________________________________________

Example :

public class Main {
  int x = 5;
}

class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
____________________________________________________________________________________________________________________________________________

7.I created multiple objects of a class and saw that each has its own set of attributes.
8.I understood how to use multiple classes:
9.One class contains attributes/methods.
10.Another class contains the main() method to run the code.
11.I learned that the Java file name should match the class name that has the main() method.

I practiced compiling and running Java files separately (e.g.,compile Main.java and Second.java, run Second).
____________________________________________________________________________________________________________________________________________

public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
