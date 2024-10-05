enum Laptop
{
    // these are objects
    // these have to come first for some reason
    // since these are objects, we can have a constructor.
    Macbook(2000), 
    Thinkpad(1000), 
    Surface(1500),
    Dell(); // need to create a default constructor for this
    
    // field
    private double price;
    
    // Default constructor
    private Laptop()
    {
        this.price = -1;
        System.out.println(this.name()+" made with default constructor.");
    }
    
    // Constructor
    private Laptop(double price) // constructors must be private
    {
        this.price = price;
        System.out.println(this.name()+" made with non-default constructor.");
    }

    // setters and getters
    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }
}

public class j19_enum_class {

    public static void main(String[] args)
    {
        // System.out.println(Laptop.values()[0].getPrice());

        // Laptop lap0 = Laptop.Macbook;

        for(Laptop lap : Laptop.values()){

            if(lap == Laptop.Dell) lap.setPrice(500);

            String price = String.format("%.2f", lap.getPrice());
            
            System.out.println("A "+lap+" costs $"+price+".");
        }

    }
}