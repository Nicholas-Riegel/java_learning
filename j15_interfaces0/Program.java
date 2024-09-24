// Interfaces are the design of a class
// They give you the necessary methods

interface A
{
    // Interface fields are final and static
    int age = 44;
    String city = "New York";

    // interfaces are always public abstract
    void show();
    void config();
}

abstract class B implements A {}

class C implements A
{

    public void show() 
    {
        System.out.println("from showC");
    }
    
    public void config() 
    {
        System.out.println("from configC");
    }
}

public class Program {

    public static void main(String[] args)
    {
        A objA; // this works bc it is creating a type

        C objC = new C();
        objC.show();
        
        System.out.println(A.city);
    }
}