public class MethodOverLoadingDemo {

    public void myMethod(){
        System.out.println("This is My First Method");
    }
    public void myMethod(String name){
        System.out.println("Hello "+name+" This is my First Method");
    }
    public static void main(String[] args) {
        MethodOverLoadingDemo md = new MethodOverLoadingDemo();
        md.myMethod();
        md.myMethod("Adarsh");
    }
}
