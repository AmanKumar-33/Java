import java.util.*;
 class Animal{
  Animal(){
   System.out.println("Animal is created");}
 }
 
 
 class Dog extends Animal{
  Dog(){
    super();
    System.out.println("dog is created");}
    
 }
 
 public class TestCase3{
  public static void main(String args[]){
   Dog d = new Dog();
   Animal A = new Animal();
   
  }
}
