# 📌 Day 5: Java Constructors

---

## 💡 What is a Constructor?

A **constructor** in Java is a special method used to initialize objects. It has the **same name as the class** and **does not have any return type**, not even `void`.

Constructors are automatically called when an object is created using the `new` keyword.

---

## 🔧 Why Use Constructors?

- To **initialize variables** when an object is created.
- To assign **default or user-defined values**.
- To make the code more organized and readable.

---

## 🧱 Types of Constructors

1. **Default Constructor** – Takes no arguments.
2. **Parameterized Constructor** – Takes one or more arguments.
3. **Constructor Overloading** – Multiple constructors with different parameters.

---

## ✳️ Programs Practiced Today

---

### ✅ 1. Constructor with a Parameter

Used to initialize an object with a single value during creation.

```java
public class Constructor_with_a_parameter {
    int x;

    public Constructor_with_a_parameter(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Constructor_with_a_parameter obj = new Constructor_with_a_parameter(17);
        System.out.println(obj.x);
    }
}
-------------------------------------------------------------------------------------------------------------
2. Constructor with Multiple Parameters
Used when multiple fields of an object need to be initialized.

public class Constructor_with_multiple_parameters {
    int modelyear;
    String carname;

    public Constructor_with_multiple_parameters(int year, String name) {
        modelyear = year;
        carname = name;
    }

    public static void main(String[] args) {
        Constructor_with_multiple_parameters car = new Constructor_with_multiple_parameters(2003, "Shambhavi");
        System.out.println(car.modelyear + " " + car.carname);
    }
}
-----------------------------------------------------------------------------------------------------------------------

3. Default Constructor

Automatically called if no constructor is explicitly defined. Can also be user-defined with no parameters.
public class DefaultConstructor {
    int x;

    public DefaultConstructor() {
        x = 15;
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println(obj.x);
    }
}

###🗝️ Key Points to Remember
✅ Constructor name must match the class name.
❌ Constructors do not have a return type
🔁 You can overload constructors within a class.
⚙️ Constructors are automatically executed when an object is created.

🎯 Learning Outcome
Today I learned:

How constructors help initialize object values

Difference between default and parameterized constructors

How to use constructors effectively in Java

🛠️ Practiced Programs:

1.Constructor with a parameter
2.Constructor with multiple parameters
3.Default constructor
✨ These concepts will help me write clean and structured object-oriented code in Java.


