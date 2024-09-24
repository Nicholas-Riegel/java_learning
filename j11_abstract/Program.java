abstract class Car
{
    // say you want to leave driving up to the indiv car types, e.g. Ford, etc.
    // abstract methods can only be defined in abstract classes
    public abstract void drive();

    public void playMusic()
    {
        System.out.println("Playing music.");
    }
}

class Ford extends Car // Ford now must implement the abstract method. 
//This is also a "concrete" class, because it's not abstract.
{
    public void drive()
    {
        System.out.println("Driving a Ford.");
    }
}

public class Program {

    public static void main(String[] args)
    {
        Ford ford = new Ford();
        ford.drive();
    }
}