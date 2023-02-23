import java.util.*;
public class Java55{
 public static void main(String args[]){
  { 
    //the variable x has scope within the bracket
    int x = 10;
    System.out.println("x :-" +x);
   }
   //error since x is out of scope
   //System.out.println("x" +x );
 }
}
