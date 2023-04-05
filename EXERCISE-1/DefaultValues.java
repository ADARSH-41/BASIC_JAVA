class DefaultValues
{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bl;
    String st;

public static void main(String[] args)
{
    DefaultValues dv = new DefaultValues();
   System.out.println("Default Byte value = "+dv.b);
   System.out.println("Default Short value = "+dv.s);
   System.out.println("Default Integer value = "+dv.i);
   System.out.println("Default Long Value = "+dv.l);
   System.out.println("Default Double Value = "+dv.d);
   System.out.println("Default Boolean Value = "+dv.bl);
   System.out.println("Default String Value = "+dv.st);
   System.out.println("Default Character Value = "+dv.c);
}
}