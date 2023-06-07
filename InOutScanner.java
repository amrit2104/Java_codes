import java.util.*;

public class InOutScanner {
    public static void main(String args[]) 
    {
        Scanner xin= new Scanner(System.in);
        String name = xin.nextLine();
        System.out.println("The name is: "+name);

        int i = xin.nextInt();

        
        for(int k=0;k<i;k++)
        System.out.println(k);
    }
}
