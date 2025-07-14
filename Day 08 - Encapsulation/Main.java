public class Main{
public static void main(String[] args)
{
Second obj=new Second();
obj.set("Shambhavi",23);
System.out.println(obj.getNewName());
System.out.println(obj.getNewAge());
obj. set(obj.getNewName(), 21);
System.out.println(obj.getNewName());
System.out.println(obj.getNewAge());
}}