import java.util.Scanner;
public class QE
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the values : ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        s.close();
        double sq = Math.sqrt(b*b-4*a*c);
        double root1 = (-b+sq)/(2*a);
        double root2 = (-b-sq)/(2*a);
        System.out.println("First Root is : "+root1);
        System.out.println("Second Root is : "+root2);
    }
}