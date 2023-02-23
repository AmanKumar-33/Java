import java.util.*;
 class A{
  int i;
  }
 //creating the subclass by extending the super class A
 class B extends A{
  int i;
  
  B(int a,int b){
     super.i = a;
     i = b;
   }
   
   void show(){
    System.out.println("i in the super class is " + super.i);
    System.out.println("i in the subclass is:-" + i);
    }
  }
public class Java63{
 public  static void main(String args[]){
      B subsow = new B(4,5);
       subsow.show();}
}      
  

