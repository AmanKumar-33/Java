public class Bike{
 void run(){
  System.out.println("running the bike ");
 }
 
public class Honda extends Bike{
  void run(){
   System.out.println("running the Honda bike ");
  }
  
  
 public static void main(String args[]){
  Honda H1 = new Honda();
  H1.run();
  Bike B1 = new Bike();
  B1.run();
  Honda H2 = new Bike();
  H2.run();
 }
}
  
   
