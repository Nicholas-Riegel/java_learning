import java.util.ArrayList;
import java.util.Arrays;
// import java.util.stream.Stream;

public class j40_stream_methods {

    public static void main(String[] args)
    {

        var nums = new ArrayList<>(Arrays.asList(4, 5, 3, 6));

        // stream can only be used once
        // Stream<Integer> s1 = nums.stream();
        
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);

        // Stream<Integer> s3 = s2.map(n -> n*2);
        
        // s3.forEach(n -> System.out.println(n));

        // int result = s3.reduce(0, (c,e) -> c+e);

        var result = nums.stream()
                        .filter(n->n%2==0)
                        .map(n->n*2)
                        .reduce(0, (c,e)->c+e);

        System.out.println(result);
    }
}