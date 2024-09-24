interface Computer
{
    void code();
}

class Laptop implements Computer
{

    public void code() 
    {
        System.out.println("Coding from Laptop");
    }
    
}

class Desktop implements Computer
{
    
    public void code() 
    {
        System.out.println("Coding from Desktop");
    }

}

class Developer
{
    public void develop(Computer computer)
    {
        computer.code();
    }
}

public class Program {

    public static void main(String[] args)
    {
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer dev1 = new Developer();
        
        dev1.develop(laptop);
        dev1.develop(desktop);
    }
}