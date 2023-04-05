import java.util.Scanner;

class Sort{
   public int[] sortOut(int[] A)
   {
       for(int i=0;i<A.length;i++)
       {
         for(int j=i+1;j<A.length;j++)
         {
            if(A[i]>A[j])
            {
               int temp = A[i];
               A[i] = A[j];
               A[j] = temp;
            }
         }
       }
      return A;
   }
 }

public class BubbleSort{
public static void main(String[] args)
{
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the number of Elements : ");
     int n = s.nextInt();
     int[] A = new int[n];
     for(int i=0;i<n;i++)
     {
        A[i] = s.nextInt();
     }
     Sort s1 = new Sort();
     A = s1.sortOut(A);
     System.out.println("Sorted Array");
     for(int i=0;i<A.length;i++)
     {
         System.out.print(A[i]+" ");
     }
}
}
