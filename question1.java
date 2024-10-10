import java.util.ArrayList;

public class question1 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> cars = new ArrayList<>();

        // Add elements
        cars.add("Sedan");
        cars.add("SUV");
        cars.add("Coupe");

        // Access elements
        System.out.println("First car type: " + cars.get(0)); // Sedan

        // Remove an element
        cars.remove("SUV");

        // Display all elements
        System.out.println("Car types: " + cars);
    }
}