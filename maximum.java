import java.util.Scanner;

public class maximum
 {
    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter " +a.length+ " elements");
        for (int i=0;i<a.length;i++)
        {
            a[i]=s1.nextInt();
        }
        int max = a[0];
        System.out.println("the maximum value is");
        for(int i=0; i<=a.length-1; i++)
        {
            if (a[i]>max)
                max=a[i];
        }
        System.out.println();
        int min = a[0];
        System.out.println("the minimum value is");
        for(int i=0;i<=a.length-1; i++)
        {
            if ( a[i]<min)
                min=a[i];
        }
        System.out.println(min+"\t");
    }
}
