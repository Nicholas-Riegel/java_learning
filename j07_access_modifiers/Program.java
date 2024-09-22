import Classes.*;

// default, no access modifier: it can be accessed in the same package
public class Program {

    public static void main(String[] args)
    {
        // A objA = new A();
        // A.Astring needs to be marked public for access in a different dir
        // System.out.println(objA.Astring);
        
        B objB = new B();
        // this is accessible even though it is not marked private!
        // it is unmarked therefore default
        // because B is in the same package/dir
        // to block this, make B.Bstring private
        System.out.println(objB.Bstring);

        C objC = new C();
        objC.GetAstring();
    }
}