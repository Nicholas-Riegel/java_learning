class MyException extends Exception
{
    public MyException(String str){

        // call the constructor of super class
        super(str);
    }
}

public class Program {

    public static void main(String[] args)
    {
        int i = 0;

        try {

            if (i == 0) throw new MyException("From MyException.");
            int answer = 9/i;
            System.out.println(answer);

        } 
        catch (MyException e) {

            System.out.println(e);

        } catch (Exception e){

            System.out.println("Exception: " + e);
        }

        System.out.println("End of program.");
    }
}