import java.util.*;
public class StringBufferDemo
{
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("ADARSH NALLA");
        sb1.delete(6,11);
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("TECH MAHINDRA");
        sb2.delete(5, sb2.length());
        System.out.println(sb2);

        StringBuffer sb3 = new StringBuffer("INFOSYS");
        sb3.deleteCharAt(4);
        System.out.println(sb3);
    }
}