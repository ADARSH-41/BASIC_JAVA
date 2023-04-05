//when an exception not occurs and is not handled by catch block

public class Finally_case1 {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            String S = "ADARSH41";
            System.out.println("The Character at the index 1 is : "+S.charAt(1));
        }
        catch(ArithmeticException ae){
            System.out.println("Exception Occurred...");
            System.out.println("Exception Description : "+ae);
        }
        finally{
            System.out.println("\"Finally\" block is always executed...");
        }
    }
}
