//when an exception occurs and not handled by catch block

public class Finally_case2 {
    public static void main(String[] args) {
        try{
                System.out.println("Inside Try Block");
                String S = "ADARSH41";
                System.out.println("The character at the index 10 is : "+S.charAt(10));
        }catch(ArithmeticException ae){
            System.out.println("Exception Occurred...");
            System.out.println("Exception Description : "+ae);
        }
        finally{
            System.out.println("\"Finally\" block is always executed.");
        }
    }
}
