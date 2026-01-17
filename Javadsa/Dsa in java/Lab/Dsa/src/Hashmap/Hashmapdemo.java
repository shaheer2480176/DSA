package Hashmap;



import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {

    public static void main(String[] args) {

        // 🔹 1. Creating a HashMap
        Map<Integer, String> students = new HashMap<>(); // Key: Roll No, Value: Name

        // 🔹 2. Insert Data
        students.put(101, "Ali");
        students.put(102, "Hamza");
        students.put(103, "Sara");
        students.put(104, "Zoya");
        students.put(105, "Ali"); // Duplicate value allowed

        System.out.println("Initial HashMap: " + students);

        // 🔹 3. Access Data
        System.out.println("Student with Roll No 101: " + students.get(101));
        System.out.println("Student with Roll No 110: " + students.get(110)); // Key not present → null

        // 🔹 4. Update Data (if key exists)
        students.put(102, "Hammad"); // updates value for key 102
        System.out.println("After updating Roll No 102: " + students);

        // 🔹 5. Remove Data
        students.remove(104); // removes key 104
        System.out.println("After removing Roll No 104: " + students);

        // 🔹 6. Check Key
        System.out.println("Does Roll No 101 exist? " + students.containsKey(101));
        System.out.println("Does Roll No 104 exist? " + students.containsKey(104));

        // 🔹 7. Size & Empty Check
        System.out.println("Total students: " + students.size());
        System.out.println("Is HashMap empty? " + students.isEmpty());

        // 🔹 8. Iterating Through HashMap

        // Using keySet()
        System.out.println("\n--- Using keySet() ---");
        for (Integer rollNo : students.keySet()) {
            System.out.println("Roll No: " + rollNo);
        }

        // Using values()
        System.out.println("\n--- Using values() ---");
        for (String name : students.values()) {
            System.out.println("Student Name: " + name);
        }

        // Using entrySet() → Best practice
        System.out.println("\n--- Using entrySet() ---");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 🔹 9. HashMap Properties Check
        students.put(null, "NoName"); // 1 null key allowed
        students.put(106, null);      // null values allowed
        System.out.println("\nAfter adding null key and value: " + students);

        // 🔹 10. Summary Demonstration
        System.out.println("\nSummary:");
        System.out.println("Key → Value: Roll No → Student Name");
        System.out.println("Fast lookup using get(key)");
        System.out.println("Duplicate keys not allowed, duplicate values allowed");
        System.out.println("Order is not guaranteed in HashMap");
    }
}
