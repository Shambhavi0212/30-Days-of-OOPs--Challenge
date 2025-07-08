public class MultipleObjectsDifferentValues {
  
  int x = 5;

  public static void main(String[] args) {
    MultipleObjectsDifferentValues myObj1 = new MultipleObjectsDifferentValues();
    MultipleObjectsDifferentValues myObj2 = new MultipleObjectsDifferentValues();
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
    