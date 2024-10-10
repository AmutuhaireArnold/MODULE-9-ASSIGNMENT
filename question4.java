import java.util.HashMap;

public class question4 {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs
        ageMap.put("Arnold", 30);
        ageMap.put("Allan", 25);

        // Accessing value
        System.out.println("Arnold's age: " + ageMap.get("Arnold")); // 30

        // Display all key-value pairs
        System.out.println("Age Map: " + ageMap);
    }
}