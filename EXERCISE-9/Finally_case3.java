//When Exception is occurred and is handled by catch block.

public class Finally_case3 {
    public static void main(String[] args) {
        try{
            System.out.println("Inside Try Block");
            String S = "ADARSH41";
            System.out.println("The character at the index 10 is : "+S.charAt(10));
        }catch(StringIndexOutOfBoundsException se){
            System.out.println("Exception Occurred...");
            System.out.println("Exception Description : "+se);
        }
        finally{
            System.out.println("\"Finally\" block is always executed.");
        }
    }
}
