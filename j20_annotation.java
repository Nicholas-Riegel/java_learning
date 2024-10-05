// built in annotations help debug
class A
{
    public void ShowWhatBelongsToThisClass()
    {
        System.out.println("In A.");
    }
}

class B
{
    @Override
    public void ShowWhatBelongToThisClass()
    {
        System.out.println("In B.");
    }
}

public class j20_annotation {

    public static void main(String[] args)
    {
        B objB = new B();
    }
}