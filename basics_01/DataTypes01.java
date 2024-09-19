import java.util.Arrays;
public class DataTypes01 {

    public static void main(String[] args) {

        /*
        PRIMITIVE DATA TYPES
        1. Integer: byte, short, int, long( add l to number)
        2. Float: float (add f to number), double 
        3. Character: char 'c'
        4. Boolean: boolean
        */

        // CASTING
        // byte a = 47;
        // int b = 14;
        // a = (byte)b;
        // System.out.println(a);

        // ARRAYS
        // length is fixed; fixed number of values;
        // but can change the values;
        // int[] arr0 = {1, 2, 3}; 
        // int[] arr1 = new int[3]; // all values are zero by default;

        // TWO DIMENSIONAL ARRAYS
        // three rows, four columns
        // int[][] arr3 = new int[3][4];
        // for(int i = 0; i < arr3.length; i++)
        // {
        //     for(int j = 0; j < arr3[0].length; j++)
        //     {
        //         arr3[i][j] = (int)(Math.random() * 10);
        //     }
        // }

        // for(int[] subArr0 : arr3)
        // {
        //     System.out.println(Arrays.toString(subArr0));
        // }

        // JAGGED ARRAY
        // int[][] arr3 = new int[3][];
        
        // arr3[0] = new int[3];
        // arr3[1] = new int[4];
        // arr3[2] = new int[2];
        
        // for(int i = 0; i < arr3.length; i++)
        // {
        //     for(int j = 0; j < arr3[i].length; j++)
        //     {
        //         arr3[i][j] = (int)(Math.random() * 10);
        //     }
        // }
        
        // for(int[] subArr : arr3)
        // {
        //     System.out.println(Arrays.toString(subArr));
        // }
        
        // THREE DIMENSIONAL ARRAYS
        // int[][][] arr4 = new int[3][4][5];

        // STRINGS
        // Strings are not a primitive data type
        // They are classes, so you have to capilatize String
        // Strings are immutable
        // String str0 = new String("Hello");
        // str0 = str0 + " World"; // this works, but dn change str0; it creates a new object: "Hello World" and reassigns the variable reference to the new object
        // the old object, "Hello", remains in the heap and becomes eligible for garbage collection
        // System.out.println(str0);

        // STRINGBUFFER
        StringBuffer sb2 = new StringBuffer("Bob");
        System.out.println(sb2.capacity()); // 19 chars: always gives you a buffer of 16 chars
        System.out.println(sb2.length()); // 3 chars
        sb2.append(" is great.");
        sb2.insert(0, "Java ");
        sb2.delete(0, 5);
        System.out.println(sb2);
        // StringBuilder is the same except it's not threadsafe

    } 
}