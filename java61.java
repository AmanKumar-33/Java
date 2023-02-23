import java.util.*;
public class A{
  int i,j;
   
   void showij(){
      System.out.println("i and j:" + i + " " +j);
    }
    
 }
 
 //create a sub class extend by class A
 class B extends A{
   int k;
   void showk(){
     System.out.println("k:" + K);
   }
   
   void sum(){
     System.out.println("i + j + K " +i +j +k);
     }
  }
  
  public class Java61{
   public static void main (String args[]){
     A superob = new A();            //the super class may be used by itself
     B subob   = new B();
     System.out.println("show the content of super class");
     superob.showij();
     System.out.println("\n");
     
     //the subclass accept all the member of superclass;
     subob.i = 10;
     subob.j = 20;
     subob.k = 30;
     System.out.println("content of subclass");
     subob.showij();
     subob.showk();
     System.out.println("sum of integer ");
     subob.sum();
     }
  }
     
     
     
