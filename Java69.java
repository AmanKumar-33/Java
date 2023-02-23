import java.lang.*;
  class Calculator{
    double i;
    double x;
    void p(){
      x = Math.sqrt(i);
      }
   }
   
public class Java69{
 public static void main(String args[])
   {
   Calculator c1 = new Calculator();
    c1.i=2;
    c1.p();
     System.out.println("value of "+ c1.i + " "+c1.x);
   }
 }
    
