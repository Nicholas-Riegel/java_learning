abstract class A
{
    public abstract void showA();
}

// If you want to implement the abstract method of an abstract class only once, 
// you can use annonymous inner class
public class j14_abstract_anonimous_class {

    public static void main(String[] args)
    {
        A objA = new A() 
        {
            public void showA()
            {
                System.out.println("Implementation of showA");
            }    
        };
        
        // here objA is a reference to a class, not an object!! (I think?)
        objA.showA();
    }
}