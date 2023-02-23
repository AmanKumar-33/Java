import java.util.*;
abstract class Base{
 abstract void fun();
 }
 
 class Exponent extends Base{
    void fun(){
     System.out.println("derived class is fun");
     }
 }
 
public class Java66{
 public static void main(String args[]){
   //Base e1= new Base();
   Base b1 = new Exponent();
   b1.fun();
   }
}
   
 
 
