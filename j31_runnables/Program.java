class Z
{

}

// Thread is a class that implements Runnable interface
// So if you want two classes to extend a parent class
// you have to use the Runnable interface 
// class A implements Runnable
// {
//     // public void show(){
//     public void run(){

//         for(int i = 0; i<=5; i++){

//             System.out.println("A.");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         } 
//     }
// }

class B implements Runnable
{
    // public void show(){
    public void run(){

        for(int i = 0; i<=5; i++){

            System.out.println("BBB.");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Program {

    public static void main(String[] args)
    {
        // since Runnable is a functional interface
        // can use lambda expression for the run() method
        Runnable objA = () -> {
            
            for(int i = 0; i<=5; i++){
    
                System.out.println("A.");
    
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } 
        };

        B objB = new B();

        // objA.start(); // but Runnable dn have a start() method
        // objB.start();

        Thread tA = new Thread(objA);
        Thread tB = new Thread(objB);

        tA.start();
        tB.start();
    }
}