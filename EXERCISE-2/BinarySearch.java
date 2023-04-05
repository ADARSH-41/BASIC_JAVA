import java.util.Scanner;
public class BinarySearch
{
        public static void main(String[] args)
    {
       int first,last,c,mid,n,search,array[];
       boolean status = false;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter no.of Elements : ");
        n = s.nextInt();
        array = new int[n];
        System.out.println("Enter "+n+" Elements in Ascending Order");
        for(c=0;c<n;c++)
        {
            System.out.print("Enter Element "+c+" : ");
            array[c] = s.nextInt();
        }
        System.out.print("Enterr Element to be searched : ");
        search = s.nextInt();

        first = 0;
        last = n-1;
        mid = (first+last)/2;
        
        while(first<=last)
        {
            if(array[mid] <= search)
            {
                first = mid+1;
            }
            else if(array[mid] == search)
            {
                status = true;
                break;
            }
            else
            {
                last = mid-1;
            }
            mid = (first+last)/2;
        }

        if(status = true)
        {
            System.out.print("The Search Element "+search+" is found at index "+mid);
        }
        else
        {
            System.out.println("The Search Element "+search+" is not found!");
        }
       
    }
}