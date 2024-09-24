interface A
{
    int age = 44;
    String city = "New York";

    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X
{

}

class B implements A,Y
{    
    public void show() 
    {
        System.out.println("in show B");
    }
    
    public void config() 
    {
        System.out.println("in config B");
    }
 
    public void run() 
    {
        System.out.println("Running...");
    }
    
}
public class Program {

    public static void main(String[] args)
    {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        // obj.run(); // this is undefined for type A
        // even though object B created it!

        B objB = new B();
        objB.run();
    }
}