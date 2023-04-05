import java.util.Scanner;

public class MergeSort {

    public static int[] Sort(int low, int high, int[] arr){
        if(low<high){
            int mid = (low+high)/2;
            Sort(low,mid-1,arr);
            Sort(mid, high+1);
            Merge(low,high,mid,arr);
        }

    public static int[] Merge()
    }
    public static int[] 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number of Elements : ");
        int n = s.nextInt();
        int[] Unsorted = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
        {
            Unsorted[i] = s.nextInt();
        }
        System.out.println("Array Unsorted : "+Arrays.toString(Unsorted));


    }
}
