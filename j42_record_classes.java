// record classes are for when you only want to store data
// class Alien
// {
//     private final int id;
//     private final String name;
    
//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

//     @Override
//     public String toString() {
//         return "Alien: [id=" + id + ", name=" + name + "]";
//     }
// }

record Alien (int id, String name){

    public Alien{ // shortened constructor (not needed, only used for checking)
        
        if (id == 0) throw new IllegalArgumentException("Id cannot be zero.");
    }
}

public class j42_record_classes {

    public static void main(String[] args)
    {
        Alien a1 = new Alien(1, "Sam");
        Alien a2 = new Alien(1, "Sam");
        // Alien a3 = new Alien(0, "Tom");
        // System.out.println(a1.getName());
        System.out.println(a1);
        System.out.println(a1.equals(a2)); // false because they are two different objects
        // have to override equals and hashCode methods, as above, to compare the data
        // note how much code we have written, just to compare values
        // this is where records come in
    }
}