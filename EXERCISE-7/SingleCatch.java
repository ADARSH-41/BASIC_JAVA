import java.util.Scanner;

public class SingleCatch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        try{
            int a = s.nextInt();
            int b = s.nextInt();
            double c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by Zero");
        }
    }
}
