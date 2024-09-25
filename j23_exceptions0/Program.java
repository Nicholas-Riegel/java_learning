
public class Program {

    public static void main(String[] args)
    {
        int i = 0;

        // Need at try catch otherwise program will stop at the error.
        // This way it will always reach the end of the program.
        try {
            
            int answer = 9/i;

            System.out.println(answer);

        } catch (Exception e) {

            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("End of program.");
    }
}