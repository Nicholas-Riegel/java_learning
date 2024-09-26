public class Program {

    public static void main(String[] args)
    {
        int i = 0;

        try {

            if (i == 0) throw new ArithmeticException("Can't divide by zero.");
            // if (i == 0) throw new ArithmeticException();
            int answer = 9/i;

        } 
        catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        } catch (Exception e){

            System.out.println("Exception: " + e);
        }

        System.out.println("End of program.");
    }
}