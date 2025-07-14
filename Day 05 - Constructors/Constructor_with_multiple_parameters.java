public class Constructor_with_multiple_parameters {
    int modelyear;
    String carname;

    public Constructor_with_multiple_parameters(int year,String name)
    {
        modelyear=year;
        carname=name;
    }
    
    public static void main(String[] args)
    {
        Constructor_with_multiple_parameters car=new Constructor_with_multiple_parameters(2003,"Shambhavi");
        System.out.println(car.modelyear+" "+ car.carname);
    }
}
