class House{  
     public void getEligibilty(String type){
           if(type=="rented")
              System.out.println("Not Eligible");
           else
              System.out.println("Eligible");  
     }
   }

public class SingleInheritanceDemo extends House{
   
    public static void main(String[] args){

         SingleInheritanceDemo s = new SingleInheritanceDemo();
         s.getEligibilty("rented");
         s.getEligibilty("owned");
    }    
 }