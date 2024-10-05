class A
{
    public void showA()
    {
        System.out.println("In showA");
    }
}

// Say you want to override the method without creating a new class and extending it
public class j13_anonimous_inner_class {

    public static void main(String[] args)
    {
        A objA = new A()
        { // this is called an anon inner class: see in bin
            public void showA()
            {
                System.out.println("In modified showA");
            }
        };

        objA.showA();
    }
}