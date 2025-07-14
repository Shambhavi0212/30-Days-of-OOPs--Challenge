🚀 Day A: Encapsulation in Java.

Code :
public class Main {
    public static void main(String[] args) {
        Second obj = new Second();
        
        // Set name and age
        obj.set("Shambhavi", 23);
        System.out.println(obj.getName());  // Output: Shambhavi
        System.out.println(obj.getAge());   // Output: 23
        
        // Updating age, keep name same
        obj.set(obj.getName(), 25);
        System.out.println(obj.getName());  // Output: Shambhavi
        System.out.println(obj.getAge());   // Output: 25
    }
}

public class Second {
    private String name;
    private int age;

    // Setter method
    public void set(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

💡 Explanation
1.Encapsulation means keeping your data (name, age) private and controlling access through public methods (set, getName, getAge).
2.We use set to update values, and getName, getAge to retrieve them safely.
3.obj.set(obj.getName(), 25); keeps the current name and updates only the age.

🖥️ Console Output
Shambhavi
23
Shambhavi
25

✅ Today I practiced setting and updating data using getters inside setters:

obj.set(obj.getName(), 25); ➡ This kept the name same, changed only age.


