
public class Program {

    public static void main(String[] args)
    {
        String str = "Hello world!";

        StringBuilder sb = new StringBuilder();

        // for (int i = 0; i<str.length(); i++) sb.insert(0, str.charAt(i));

        for (char c : str.toCharArray()) sb.insert(0, c);
        
        System.out.println(sb.toString());
    }
}