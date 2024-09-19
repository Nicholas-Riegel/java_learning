class Calculator {

    public int Add(int x, int y)
    {
        return x + y;
    }
    // method overloading, requires different parameters
    public double Add(double x, double y)
    {
        return x + y;
    }
    
}

public class Program {

    public static void main(String[] args) {
        
        Calculator calc1 = new Calculator();

        int result = calc1.Add(5, 4);

        System.out.println("The answer is: " + result);
    }
}

