
class Animal{
    String legs = "four";
    String eyes = "two";    
}

class Dog extends Animal{
    String name = "Dog";
    public void getData(){
        System.out.println(name+" has "+legs+" legs"+" and "+eyes+" eyes.");
    }   
}

public class MultilevelInheritanceDemo {
     public static void main(String[] args){
          Dog d = new Dog();
          d.getData();
     }
}