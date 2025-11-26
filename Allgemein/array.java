import java.util.ArrayList;
import java.util.Arrays; // Needed for Arrays.asList() - converts array to List

public class array {
    public static void main(String[] args) {
        
        // ===== ARRAYS (Fixed Size) =====
        int[] numbers = {1, 2, 3, 4, 5};
        
        // 1. Traditional for loop - Access by index
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2; // Example: Modify value at index
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        // 2. For-each loop - Read-only access to values
        for (int num : numbers) {
            System.out.println("Value: " + num);
        }
        
        
        // ===== ARRAYLISTS (Dynamic Size) =====
        // Arrays.asList converts array to List
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna", "Bob", "Charlie"));
        
        // Common Actions
        names.add("David"); // Add to end
        names.add(0, "Zoe"); // Add at specific index
        names.remove("Bob"); // Remove by value
        names.remove(1); // Remove by index
        names.set(0, "Zara"); // Update/Replace value at index
        boolean hasAnna = names.contains("Anna"); // Check if exists
        System.out.println("Size: " + names.size()); // Get size
        
        // 1. Traditional for loop - Modify list or use index
        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).toUpperCase()); // Example: Modify element
            System.out.println("Index " + i + ": " + names.get(i));
        }
        
        // 2. For-each loop - Read values (cannot modify structure)
        for (String name : names) {
            if (name.startsWith("A")) { // Example: Filter logic
                System.out.println("Starts with A: " + name);
            }
        }
    }
}
