class Counter
{
    int count;
    // synchronized will make sure count is 2000
    // will make sure only one thread works at a time with the variable
    public synchronized void increment(){
        count++;
    }
}

public class j32_race_conditions {

    
    public static void main(String[] args) throws InterruptedException
    {
        
        Counter c = new Counter();
        // since Runnable is a functional interface
        // can use lambda expression for the run() method
        Runnable objA = () -> {
            
            for(int i = 0; i<1000; i++){
    
                c.increment();
            } 
        };
        
        Runnable objB = () -> {
            
            for(int i = 0; i<1000; i++){
                
                c.increment();
            } 
        };

        Thread tA = new Thread(objA);
        Thread tB = new Thread(objB);

        tA.start();
        tB.start();

        // with 'synchronized' the join() method waits for each thread to complete
        tA.join();
        tB.join();

        System.out.println(c.count);
    }
}