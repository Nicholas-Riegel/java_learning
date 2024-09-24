class Mobile {

    String brand; //instance variable
    double price;
    static String type; // static variable: making this static means it's common for all

    // STATIC BLOCK
    static
    {
        type = "Phone";
        System.out.println("in static block");
    }

    // CONSTRUCTOR
    public Mobile()
    {
        brand = "No brand.";
        price = 0;
        System.out.println("in constructor");
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
    public static void Details2(Mobile obj)
    {
        System.out.println("Brand: "+obj.brand+".\nPrice: "+obj.price+".\nType: "+type+"."); // can use static variable in non-static methods
    }
    
}

public class StaticBlock {

    public static void main(String[] args) throws ClassNotFoundException {
        
        // Classes do not load unless an object is instantiated
        // to load a class without instantiating:
        Class.forName("Mobile");
    }
}

