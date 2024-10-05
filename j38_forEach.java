import java.util.ArrayList;
import java.util.Arrays;

public class j38_forEach {

    public static void main(String[] args)
    {

        var nums = new ArrayList<>(Arrays.asList(4, 5, 3, 6));

        nums.forEach(n -> System.out.println(n));

    }
}