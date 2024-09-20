// every constructor has a super() method which calls the constructor of the super class
// every class in Java extends the Object class
class A
{
    public A()
    {
        System.out.println("From A's default constructor.");
    }

    public A(String a)
    {
        System.out.println("From A's parameterized constructor: "+a+".");
    }
}

class B extends A
{
    public B()
    {
        System.out.println("From B's default constructor.");
    }
    
    public B(String a)
    {
        // super(); // call the default constructor of the super class
        // calling the default because not passing a parameter
        // to call the parameterized constructor, pass the parameter
        this(); // call the constructor of this class
        System.out.println("From B's parameterized constructor: "+a+".");
    }
}

public class Program {

    public static void main(String[] args) {
        
        B obj = new B("hello");
    }    
}