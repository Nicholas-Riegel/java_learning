import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    String name;
    int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class j36_sorting2 {

    public static void main(String[] args)
    {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 21));
        students.add(new Student("Jane", 18));
        students.add(new Student("Tom", 19));
        students.add(new Student("Dave", 20));

        // suppose you want to sort by second digit
        // Comparator<Student> com = new Comparator<Student>() {
            
        //     public int compare(Student i, Student j){

        //         if (i.age > j.age){
        //             return 1; // 1 is swap, -1 is don't swap
        //         } else {
        //             return -1;
        //         }
        //     }     
        // };
        
        // using lambda becuase Comparator is a functional interface
        Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1; 

        Collections.sort(students, com);
        
        for (Student stud : students){
            System.out.println(stud);
        }
    }
}