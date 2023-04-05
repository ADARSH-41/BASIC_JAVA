import java.util.ArrayList;
import java.util.Scanner;

public class ClassMechanism {
    public ArrayList Data(int num){
        String[] S = {"ADARSH","TCS","TECH","MAHINDRA","JAVA","PYTHON","CPP","C","VBA","C#"};
        ArrayList<String> res = new ArrayList<>();
        for(int i=0;i<10;i++){
            if(S[i].length()==num)
              res.add(S[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string length : ");
        int num = s.nextInt();
        ClassMechanism cm = new ClassMechanism();
        ArrayList<String> res = cm.Data(num);
        s.close();
        for(String i:res)
        {
            System.out.println(i);
        }
    }

}
