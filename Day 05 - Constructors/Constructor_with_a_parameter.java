public class Constructor_with_a_parameter {
    int x;
    public Constructor_with_a_parameter(int y)
    {
       x=y; 
    }
    public static void main(String[] args)
    {
        Constructor_with_a_parameter obj=new Constructor_with_a_parameter(17);
        System.out.println(obj.x);

    }
}
