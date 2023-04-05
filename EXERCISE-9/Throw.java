public class Throw {
    static void printName(){
        try{
            System.out.println("My Name is Adarsh");
            throw new NullPointerException("demo");
        }
        catch(Exception e){
            System.out.println("Caught inside printName() method");
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            printName();
        }catch(NullPointerException e){
            System.out.println("Caught inside main");
        }
    }
}
