import java.util.HashSet;

public class question3 {
    public static void main(String[] args) {
        HashSet<String> uniqueCities = new HashSet<>();

        // Adding elements
        uniqueCities.add("New York");
        uniqueCities.add("Los Angeles");
        uniqueCities.add("New York"); // Duplicate

        // Display unique elements
        System.out.println("Unique Cities: " + uniqueCities);
    }
}