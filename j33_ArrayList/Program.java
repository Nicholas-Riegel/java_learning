/*
 * Collection
 * List: ArrayList, LinkedList
 * Queue: Dequeue
 * HashSet: LinkedHashSet
 * Map
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args)
    {
        ArrayList<Object> numsArr = new ArrayList<>(
                
                Arrays.asList(1, 2, 3)
            );
        
        //add to end
        numsArr.add("four");
        System.out.println(numsArr);

        // remove from end
        numsArr.remove(numsArr.size()-1);
        System.out.println(numsArr);

        // add to begining
        numsArr.add(0, 0);
        System.out.println(numsArr);
        
        // remove from beginning
        numsArr.remove(0);
        System.out.println(numsArr);

        // get at index
        System.out.println(numsArr.get(1));

        // set at index
        numsArr.set(1, "two");
        System.out.println(numsArr);

    }
}