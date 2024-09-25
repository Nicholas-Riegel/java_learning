// @FunctionalInterface
// Lambda expression only work with functional interface 
// bc there is no ambiguity about what method is being called. 
// Annotation not needed
interface A
{
    int add(int i, int j);
}

public class Program {

    public static void main(String[] args)
    {
        // old way
        // A objA = new A() {
            
        //     public int add(int i, int j){
        //         return i+j;
        //     }     
        // };
        
        // new way
        // A objA = (i, j) -> { //already know that it's an int

        //     System.out.println("Hello");
            
        //     return i+j;
        // };
        
        // OR
        A objA = (i, j) -> i+j;

        System.out.println("The answer is: " + objA.add(4, 5));
    }
}

/**
 * Types of interface
 * Normal: more than one method
 * SAM (Single Abstract Method)/ functional: one method
 * Marker: empty interface for interacting with compiler
 * has something to do with memory, serialization and deserialization
 */