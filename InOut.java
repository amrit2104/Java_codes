import java.io.*;
public class InOut 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

        String name = x.readLine();
        System.out.println("The name is: " + name);
        int i=Integer.parseInt(x.readLine());

        for(int k=0;k<i;k++)
        System.out.println(k);
    }    
}
