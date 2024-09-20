class Human
{
    // instance variables should always be private
    private String name;
    private int age;

    // Default Constructor
    public Human()
    {
        this.name = "No name.";
        this.age = 0;
    }
    
    // Constructor overloading
    public Human(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    // right click here, generate getters and setters
    public String getName() {
        return name;
    }
    public void setName(String a) {
        name = a;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }
    
}

public class j03Encapsulation {

    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setName("Nick");
        human1.setAge(4);

        System.out.println(human1.getName());
        System.out.println(human1.getAge());

        System.out.println(new Human().getName()); // Anonymous object
        
    }
}