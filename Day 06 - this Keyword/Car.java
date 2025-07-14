public class Car {
    String model;
    int year;

    
public Car(String model){
    this.model=model;
}

public Car(int year,String model)
{
this.year=year;
this.model=model;
}

public void printInfo()
{
System.out.println(year+" "+model);
}

public static void main(String[] args)
{
Car c1=new Car("Benz");
Car c2=new Car(1991,"Heroku");
c1.printInfo();
c2.printInfo();
}}
