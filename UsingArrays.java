import java.util.*;

public class UsingArrays 
{
    public static void main(String args[])
    {
        try (Scanner x = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n=x.nextInt();

            // input in array
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = x.nextInt();

            for(int i=0;i<n;i++)
            System.out.println(arr[i]);
        }
    }    
}
