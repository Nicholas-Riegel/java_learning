class Human
{
    // instance variables should always be private
    private String name;
    private int age;

    // right click here, generate getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}

public class j03Encapsulation {

    public static void main(String[] args) {

        Human human1 = new Human();
        // human1.name = "Nick";
    }
}