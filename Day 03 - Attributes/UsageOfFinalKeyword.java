public class UsageOfFinalKeyword {
    
  final int x = 10;

  public static void main(String[] args) {
    UsageOfFinalKeyword  myObj = new UsageOfFinalKeyword ();
    // myObj.x = 25; // This will generate an error
    System.out.println(myObj.x);
  }
}
