import java.util.Map;
// import java.util.HashMap;
import java.util.Hashtable;

public class Program {

    public static void main(String[] args)
    {
        // Map<String, Integer> students = new HashMap<>();
        Map<String, Integer> students = new Hashtable<>(); // synchronized

        students.put("John", 41);
        students.put("Jane", 32);
        students.put("Ken", 1);
        
        students.put("Ken", 12);
        
        System.out.println(students);
        System.out.println(students.get("Ken"));

        System.out.println(students.keySet());

        for (String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
    }
}