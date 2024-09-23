class A
{
    public void ShowA()
    {
        System.out.println("Show A");
    }
}

class B extends A
{
    public void ShowB()
    {
        System.out.println("Show B");
    }
}

public class Program {

    public static void main(String[] args)
    {
        // UPCASTING
        A objA = new B();
        objA.ShowA();
        // objA.ShowB(); Dn work

        // DOWNCASTING
        B objB = (B) objA;
        objB.ShowA();
        objB.ShowB();
    }
}