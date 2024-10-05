class A
{
    public void Show() throws ClassNotFoundException // this passes the buck of checking the exception to the class calling this object
    {
        Class.forName("Calc");
    }
}

public class j26_ducking_throws {

    public static void main(String[] args)
    {
        A objA = new A();
        
        try {

            objA.Show();

        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();

        }
    }
}