import java.util.*;
class Cat{
  void speak(){
    System.out.println("meooow");
  }
 }
 
class PetCat extends Cat{
  void speak(){
    System.out.println("meow");
    }
 }
 
 class WildCat extends Cat{
  static boolean noOne;
  
   void speak(){
    if(noOne){
      super.speak();}
    else
      System.out.println("no memow - memow is there");
   }
 }
 
public class Java64{
 public static void main(String args[]){
  WildCat w1 = new WildCat();
  PetCat  p1 = new PetCat();
  w1.noOne = true;
  w1.speak();
  p1.speak();
  w1.noOne = false;
  w1.speak();
  
  }
}
  
 
