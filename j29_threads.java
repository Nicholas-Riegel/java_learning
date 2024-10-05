class A extends Thread
{
    // public void show(){
    public void run(){

        for(int i = 0; i<=100; i++) System.out.println("From class A.");
    }
}

class B extends Thread
{
    // public void show(){
    public void run(){

        for(int i = 0; i<=100; i++) System.out.println("From class B.");
    }
}

public class j29_threads {

    public static void main(String[] args)
    {
        A objA = new A();
        B objB = new B();

        objA.start(); // calls run method, so you need a run method in the class
        objB.start();
    }
}