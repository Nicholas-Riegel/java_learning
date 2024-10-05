import java.util.HashMap;
import java.util.Map;

public class key_value_pairs {
    public static void main(String[] args) {
        
        // Create a HashMap to store key-value pairs
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);

        // Accessing a value using its key
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // Iterating through keys and values
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Checking if a key or value exists
        System.out.println("Contains key 'Banana': " + map.containsKey("Banana"));
        System.out.println("Contains value 2: " + map.containsValue(2));
    }
}
