public class OverridingExistingValues {
   
  int x = 10;

  public static void main(String[] args) {
    OverridingExistingValues myObj = new OverridingExistingValues();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}

    

