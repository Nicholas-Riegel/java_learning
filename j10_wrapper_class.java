/**
 * WRAPPER CLASSS
 * int -> Integer
 * char -> Character
 * double -> Double
 * These are needed to work in frameworks, such as Collections
 * Becase int, char are primitive
 * And certain frameworks only work with objects
 * The Wrapper class makes primitives objects
 */
public class j10_wrapper_class {

    public static void main(String[] args)
    {
        int num1 = 1;
        // Integer num2 = new Integer(2); deprecated
        Integer num3 = 3; // autoboxing: making it an object
        Integer newNum1 = num1; // autoboxing

        // to convert back
        // int backNum1 = newNum1.intValue(); // unboxing
        int backNum1 = newNum1; // auto-unboxing
         
        // System.out.println(backNum1);

        String str = "12";
        // double twelve = Double.parseDouble(str);
        Double twelve = Double.parseDouble(str); // either works
        System.out.println(twelve * 2);
    }
}