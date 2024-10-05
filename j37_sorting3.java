import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// using a Comparable in the class instead of making a Comparator

class Student implements Comparable<Student>
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

    public int compareTo(Student that) { // from the Comparable interface

        if (this.age > that.age){
            return 1; // 1 is swap, -1 is don't swap
        } else {
            return -1;
        }
    }
}

public class j37_sorting3 {

    public static void main(String[] args)
    {

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 21));
        students.add(new Student("Jane", 18));
        students.add(new Student("Tom", 19));
        students.add(new Student("Dave", 20));

        Collections.sort(students); // now this will sort the students by age without making a Comparator
        
        for (Student stud : students){
            System.out.println(stud);
        }
    }
}