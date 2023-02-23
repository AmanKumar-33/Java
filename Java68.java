class BaseClass{
 public int x = 10;
 private int y = 10;
 protected int z = 10;
 int a = 20; //default set of integer
 public int getX(){
  return x;}
 public void setX(int x){
  this.x= x;}
 private int getY(){
  return x;}
 private void setY(int y){
  this.y= y;}
  protected int getZ(){
  return x;}
 protected void setZ(int z){
  this.z= z;}
  int getA(){
  return x;}
 public void setA(int a){
  this.a= a;}
}
public class Java68 extends BaseClass{
 public static void main(String args[]){
   BaseClass B1 = new BaseClass();
   Java68    J1 = new Java68();
   System.out.println("value of the x is : " + B1.x);
   J1.setX(20);
   System.out.println("value of the x is : " + B1.x);
   System.out.println("value of the Z is : " + J1.z);
   J1.setZ(20);
   System.out.println("value of the Z is : " + J1.z);
   System.out.println("value of the A is : " + J1.a);
   J1.setA(60);
   System.out.println("value of the A is : " + J1.a);
   }
 }
   
