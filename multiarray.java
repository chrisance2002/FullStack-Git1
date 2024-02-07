import java.util.Scanner;
public class multiarray
{
    public static void main(String args[])
    {
        int[][]arr = new int[3][3];
        Scanner s1 = new Scanner (System.in);
        System.out.println("enter the input");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                arr[i][j] = s1.nextInt();
            }
        }
        for (int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

