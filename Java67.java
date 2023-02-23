import java.util.*;
abstract class Base{
  Base(){
    System.out.println("fun in the Base class");
    }
 abstract void fun();
 }
 
 
 class Exponent extends Base{
  Exponent(){
      super();
     System.out.println("fun in the exponent class");
     }
     
     void fun(){
    System.out.println("fun in the fun Method");}
 }
 
 public class Java67{
  public static void main(String args[]){
   Exponent E1 = new Exponent();
    E1.fun();
    }
 }
    
     
