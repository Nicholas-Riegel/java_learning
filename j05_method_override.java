class A
{
    public void Show()
    {
        System.out.println("In A show.");
    }

    public void config()
    {
        System.out.println("In A config.");
    }
}

class B extends A
{
    // this will override A's Show method
    public void Show()
    {
        System.out.println("In B show.");
    }
}

public class j05_method_override {

    public static void main(String[] args) {

        B obj = new B();
        obj.Show();
    }
}