import java.util.Scanner;;
public class Racing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();
        int E = s.nextInt();

        int avg = (A+B+C+D+E)/5;
        System.out.println("Qualified Racers are : ");
        if(A>avg)
          System.out.println("Racer A with speed "+A);
        if(B>avg)
          System.out.println("Racer B with speed "+B);
        if(C>avg)
          System.out.println("Racer C with speed "+C);
        if(D>avg)
          System.out.println("Racer D with speed "+D);
        if(E>avg)
          System.out.println("Racer E with speed "+E);
    }
}
