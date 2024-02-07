import java.util.Scanner;

public class sumarray
{
    /**
     * @param args
     */
    public static void main(String args[])
    {
        int array[] = new int[5];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the array");
        for (int i = 0; i < array.length; i++)
            array[i] = s1.nextInt();
        System.out.println("the array elements are");
        for (int i = 0; i <array.length; i++)
            System.out.print(array[i] + "\t");
        System.out.println();
        int sum=0;
        for (int i = 0; i < array.length; i++)
        {
            sum=sum+array[i];
        }
        System.out.println(" Sum of all elements in an array : " +sum);
    }
}