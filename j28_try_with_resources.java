import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j28_try_with_resources {

    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter your name.");
        // BufferedReader br = null;

        // This will close it automatically
        // instead of using a finally block to close it
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) 
        {
    
            String input = br.readLine();

            System.out.println(input);

        } catch (Exception e) {

            System.out.println(e);

        } 
        // finally 
        // {

        //     br.close();
        // }

        System.out.println("End of program.");
    }
}