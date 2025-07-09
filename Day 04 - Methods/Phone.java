public class Phone {

public void makeCall(String contact)
 {
System.out.println("Calling " + contact + " ... ");
 }
public void batteryLevel(int level) {
System.out.println("Battery level: " + level + "%");
}

public static void main(String[] args) {
Phone myPhone = new Phone();
myPhone.makeCall("Alice");
myPhone.batteryLevel(85);
}}