class Person{
    public void eat()
    {
        System.out.println("I can eat");
    }
}

class Student extends Person{
    public void study()
    {
        System.out.println("I can study");
    }
    public static void main(String[] args)
    {
        Student s=new Student();
        s.eat();
        s.study();
    }
}