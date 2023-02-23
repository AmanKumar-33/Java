import java.util.*;
public class Java56{
 public static void main(String args[]){
 
  {
   for(int i=0; i<=4; i++){
    System.out.println("x:-" +i);
    }
  }
   //will produce the error because the i is out of scope
  //System.out.println("x" +i); 
 }
}
