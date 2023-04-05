import java.util.*;

interface I1{
    final String name = "ADARSH";
    int calc(int a,int b,char c);
}

class InterfaceImp implements I1{
    public int calc(int a,int b,char c)
    {
        int r = 0;
        switch (c) {
            case '+':
                 r = a+b;break;
            case '-':
                 r = a-b;break;
            case '*':
                 r = a*b;break;
            case '/':
                r = a/b;break;
            default:
                break;
        }
        return r;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = s.nextInt();

        System.out.print("Enter b : ");
        int b = s.nextInt();

        System.out.print("Enter operation to be done (Only Symbol) : ");
        char c = s.next().charAt(0);

        InterfaceImp i = new InterfaceImp();

        System.out.print("Hello "+name+" The result you need is : "+i. calc(a,b,c));
        
    }
}
