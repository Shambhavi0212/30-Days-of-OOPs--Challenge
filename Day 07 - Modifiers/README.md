# Day 8 — Java Modifiers

## 💡 What are Modifiers?
Modifiers in Java change the **visibility**, **behavior**, or **rules** of classes, attributes, methods, and constructors.  

They are divided into two groups:
- **Access Modifiers** — control the access level
- **Non-Access Modifiers** — provide other functionality

---

## 🔑 Access Modifiers — Control Where Code Can Be Accessed
| Modifier    | Description                                      |
|-------------|--------------------------------------------------|
| `public`     | Accessible from anywhere                        |
| `private`    | Accessible only within the same class           |
| `default`    | Accessible within the same package (no keyword) |
| `protected`  | Accessible in the same package + subclasses     |

---

## 🔑 Non-Access Modifiers — Provide Additional Meaning
| Modifier       | Description                                      |
|----------------|--------------------------------------------------|
| `final`        | Cannot be changed or overridden                  |
| `static`       | Belongs to the class, not an object              |
| `abstract`     | Cannot be instantiated; must be inherited        |
| `transient`    | Skipped during serialization                     |
| `synchronized` | Only one thread can access at a time             |
| `volatile`     | Always read variable from main memory            |

---

## 🚀 Example Code

```java
// Abstract class with final variable and static method
abstract class Animal {
    final String type = "Mammal";  // final variable

    static void showType() {       // static method
        System.out.println("All animals of this class are mammals");
    }

    abstract void sound();         // abstract method
}

// Subclass provides body for abstract method
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal.showType();  // Call static method without object

        Dog myDog = new Dog();
        myDog.sound();      // Call implemented abstract method
        System.out.println("Type: " + myDog.type);

        // myDog.type = "Reptile";  // ❌ Error: final variable can't be reassigned
    }
}
