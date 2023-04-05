class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

public class UserDefined_Exception{
    public static void main(String[] args) {
        try{
            throw new MyException("Adarsh's Abnormal Compiler Crash Exception");
        }
        catch(MyException me){
            System.out.println("Caught");
            System.out.println(me.getMessage());
        }
    }
}