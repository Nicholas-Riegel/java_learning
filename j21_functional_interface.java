@FunctionalInterface // use this to show that there is only one method
// this will show error if more than one method
interface A
{
    void Show();
    void Run();
}

class B implements A
{
    public void Show()
    {
        System.out.println("In B.");
    }
}

public class j21_functional_interface {

    public static void main(String[] args)
    {
        // B objB = new B();
        // objB.Show();

        A objA = new A() {
            
            public void Show(){
                System.out.println("In A.");
            }            
        };

        objA.Show();
    }
}