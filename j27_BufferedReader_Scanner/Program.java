import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a number.");

        // old way
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // String input = bf.readLine();
        // Integer num = Integer.parseInt(input);
        // System.out.println(num);
        // bf.close();

        // new way
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        System.out.println(input);

    }
}