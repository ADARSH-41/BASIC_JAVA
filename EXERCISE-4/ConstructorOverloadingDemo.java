public class ConstructorOverloadingDemo {

    ConstructorOverloadingDemo(){
        System.out.println("This is Default Constructor");
    }
    
    ConstructorOverloadingDemo(String S)
    {
        System.out.println("Hello "+S+" This is an overloaded Constructor!");
    }

    ConstructorOverloadingDemo(String S, int I){
        String suff = "";
        switch(I)
        {
            case 1: suff = "st"; break;
            case 2: suff = "nd"; break;
            case 3: suff = "rd"; break;
            default : suff = "th"; break;
        }
        System.out.println("Hello "+S+" This is "+I+suff+" overloaded constructor");
    }

    public static void main(String[] args) {
        ConstructorOverloadingDemo cl = new ConstructorOverloadingDemo();
        ConstructorOverloadingDemo cl1 = new ConstructorOverloadingDemo("Adarsh");
        ConstructorOverloadingDemo cl2 = new ConstructorOverloadingDemo("Adarsh",2);
    }
}
