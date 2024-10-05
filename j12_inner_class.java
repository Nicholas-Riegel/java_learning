class A
{
    public void showA()
    {
        System.out.println("In showA");
    }

    class B
    {
        public void showB()
        {
            System.out.println("In showB");
        }
    }
}

// Static inner class
class C
{
    public void showC()
    {
        System.out.println("In showC");
    }

    static class D
    {
        public void showD()
        {
            System.out.println("In showD");
        }
    }
}

public class j12_inner_class {

    public static void main(String[] args)
    {
        A objA = new A();
        A.B objB = objA. new B();

        objB.showB();

        // static inner class
        C.D objD = new C.D();
        objD.showD();
    }
}