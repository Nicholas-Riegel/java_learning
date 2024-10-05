class A extends Thread
{
    // public void show(){
    public void run(){

        for(int i = 0; i<=100; i++){

            System.out.println("A.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
    }
}

class B extends Thread
{
    // public void show(){
    public void run(){

        for(int i = 0; i<=100; i++){

            System.out.println("BBB.");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class j30_thread_priority {

    public static void main(String[] args)
    {
        A objA = new A();
        B objB = new B();

        // lowest priority is 0, highest is 10
        // objA.setPriority(10); // this is still only a suggestion to the scheduler
        // objA.setPriority(Thread.MAX_PRIORITY);

        objA.start(); // calls run method, so you need a run method in the class
        objB.start();
    }
}