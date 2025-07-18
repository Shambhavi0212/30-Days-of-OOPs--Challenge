# 🚀 Day 11 - Multiple Inheritance in Java

## 📌 What I Learned Today: Multiple Inheritance

### 🔍 Definition:
**Multiple Inheritance** allows a class to inherit features (methods and properties) from more than one parent. While this is supported in some languages like C++, Java does **not** allow multiple inheritance with classes to prevent ambiguity (commonly known as the *Diamond Problem*).

### 🧠 Java's Approach:
- ✅ Java supports **multiple inheritance through interfaces**
- ❌ Java does **not support multiple inheritance through classes**

### ✅ Example: Multiple Inheritance using Interfaces
```java
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    public void methodB() {
        System.out.println("Method B from interface B");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
