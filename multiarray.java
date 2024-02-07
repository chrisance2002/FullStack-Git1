import java.util.Scanner;
public class multiarray
{
    public static void main(String args[])
    {
        int[][]arr1 = new int[3][3];
        Scanner s1 = new Scanner (System.in);
        System.out.println("enter the input matrics 1 ");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                arr1[i][j] = s1.nextInt();
            }
        }
        for (int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }
        int[][]arr2 = new int[3][3];
        Scanner s3 = new Scanner (System.in);
        System.out.println("enter the input matrics 2 ");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                arr2[i][j] = s3.nextInt();
            }
        }
        for (int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

