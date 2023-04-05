import java.util.*;

public class MultipleCatch {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=0,b=0,c=0;
        int[] d = new int[10];

        try{
            a = s.nextInt();
            b = s.nextInt();
            c = a/b;

            d[0] = a;
            d[1] = b;
            d[c] = c;
        }
        catch(InputMismatchException e){
            System.out.println("You entered Input of wrong type...");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by Zero...");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index not present...");
        }
        finally{
            System.out.println(a+"/"+b+" = "+c);
            System.out.println(Arrays.toString(d));
        }
    }
}
