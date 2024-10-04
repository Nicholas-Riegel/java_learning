import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args)
    {

        // suppose you want to sort by second digit
        Comparator<Integer> com = new Comparator<Integer>() {
            
            public int compare(Integer i, Integer j){

                if (i%10 > j%10){
                    return 1; // 1 is swap, -1 is don't swap
                } else {
                    return -1;
                }
            }     
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(42);
        nums.add(29);
        nums.add(57);
        nums.add(14);

        // Collections.sort(nums);
        Collections.sort(nums, com);

        System.out.println(nums);

    }
}