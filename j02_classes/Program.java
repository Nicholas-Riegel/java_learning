class Calculator {

    String brand; //instance variable
    double price;
    static String type; // static variable: making this static means it's common for all

    public int Add(int x, int y)
    {
        return x + y;
    }
    // method overloading, requires different parameters
    public double Add(double x, double y)
    {
        return x + y;
    }

    public void Details()
    {
        System.out.println("Brand: "+brand+".\n Price: "+price+".\nType: "+type+"."); // can use static variable in non-static methods
    }
    
    public static void ShowType()
    {
        System.out.println("Type: "+type+"."); // cannot use instance variables in static methods
    }
    
    // unless you pass the object as a parameter
    public static void Details2(Calculator obj)
    {
        System.out.println("Brand: "+obj.brand+".\nPrice: "+obj.price+".\nType: "+type+"."); // can use static variable in non-static methods
    }
    
}

public class Program {

    public static void main(String[] args) {
        
        Calculator calc1 = new Calculator();
        
        // int result = calc1.Add(5, 4);
        
        // System.out.println("The answer is: " + result);
        
        Calculator calc2 = new Calculator();

        calc1.brand = "Apple";
        calc1.price = 1200;
        // calc1.type = "Calculator";
        
        calc2.brand = "Samsung";
        calc2.price = 1200;
        // calc2.type = "Hot Calculator";

        Calculator.type = "Hot Calc"; // this is the proper way to do it
        // can use static variables in non-static methods

        // calc1.Details();
        // calc2.Details();
        
        // Calculator.ShowType();
        Calculator.Details2(calc2);

        System.out.println("Program ran");
    }
}

