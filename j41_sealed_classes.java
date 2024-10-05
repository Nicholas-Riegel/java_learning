sealed class A permits B, C
{
    
}

// must add final, sealed, or non-sealed
final class B extends A
{

}

non-sealed class C extends A
{

}

class D
{

}

public class j41_sealed_classes {

    public static void main(String[] args)
    {
        System.out.println();
    }
}