package Data_Structure_and_algorithms_Using_Java.Recursion;
//Calculates factorial of a positive integer
import java.util.*;
public class Factorial {
    public static int Fact(int N)
    {
        if(N == 0)
            return 1;
        else
        {
            return(N * Fact(N-1));
        }
    }
    public static void main(String ss[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(Fact(N));
    }
}
