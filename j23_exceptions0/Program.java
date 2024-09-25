public class Program {

    public static void main(String[] args)
    {
        int i = 2;
        int[] array0 = new int[5];

        // Need at try catch otherwise program will stop at the error.
        // This way it will always reach the end of the program.
        try {
            
            int answer = 9/i;

            System.out.println(answer);
            System.out.println(array0[10]);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("There is no item for that index.");

        } catch (Exception e){

            System.out.println("Exception: " + e);
        }

        System.out.println("End of program.");
    }
}