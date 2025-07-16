# 🚀 Day 8 - Java Packages & API

## 📅 Date: July 8, 2025  
## 🧠 Topics Covered:
- ✅ Java Packages
- ✅ Java API (Application Programming Interface)
- ✅ Importing classes and packages
- ✅ Built-in vs User-defined packages
- ✅ Compiling and running Java files with packages

## 📦 Java Packages Overview:
A package in Java is a way to group related classes, interfaces, and sub-packages together to keep your code organized, avoid name conflicts, and make it easier to manage large projects — similar to putting related files into the same folder on your computer.


### 📚 Types of Packages:
1. **Built-in Packages** – Provided by Java (like `java.util`, `java.io`)
2. **User-defined Packages** – Created by the user

### 🔑 Syntax:
```java
import package.name.ClassName;  // Import specific class
import package.name.*;          // Import entire package

## Run the javac command using the correct relative path
javac -d . mypack/MyPackageClass.java
This will:
                  Compile the Java file located at mypack/MyPackageClass.java
                  Output the .class file inside the proper mypack directory structure
To Run the Program:
After successful compilation, run it with:
                  java mypack.MyPackageClass