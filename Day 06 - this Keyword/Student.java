public class Student 
{
String name;

public Student(String name)
{
this.name=name;
}
public void display()
{
System.out.println("Student name is :"+name);
}
public static void main(String[] args)
{
Student s1=new Student("Shambhavi");
s1.display();
}}

