Day 3/30 - Java Class Attributes | 30 Days of OOPs 🚀

📌 Main Points Learned
1.Class attributes are variables defined inside a class. They are also called fields.
2.Attributes can be accessed using an object of the class via dot (.) syntax.
3.Attributes can be modified after creating an object unless they are marked as final.
4.The final keyword makes an attribute constant — it cannot be changed after initialization.
5.Creating multiple objects of a class allows each object to maintain its own values for the attributes.
6.A class can have multiple attributes of different types (e.g. int, String).

1️⃣ Declaring Attributes

public class Main {
  int x = 5;
  int y = 3;
}

2️⃣ Accessing Attributes

public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
3️⃣ Modifying Attributes

public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}

4️⃣ Overriding Existing Values

public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}

5️⃣ Using final Keyword (Prevent Modifications)

public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    // myObj.x = 25; // This will generate an error
    System.out.println(myObj.x);
  }
}

6️⃣ Multiple Objects, Different Attribute Values

public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();
    Main myObj2 = new Main();
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}