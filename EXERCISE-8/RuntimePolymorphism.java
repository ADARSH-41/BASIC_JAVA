class A{
    void a1(){
        System.out.println("Inside A's a1 method");
    }
}
class B extends A{
    void a1(){
        System.out.println("Inside B's a1 method");
    }
}
class C extends B{
    void a1(){
        System.out.println("Inside C's a1 method");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

        A ref = a;
        ref.a1();

        ref = b;
        ref.a1();

        ref = c;
        ref.a1();
    }
}
