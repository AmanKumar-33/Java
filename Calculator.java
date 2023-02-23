import java.lang.*;//math class is already defined in the package 
import java.util.Scanner.*;


class Calculator{
double i;
double x = Math.sqrt(i);
}
class Example{
public static void main(String args[]){
Calculator c = new Calculator();
c.i =Integer.parseInt(args[0]);
System.out.println("square root of "+c.i+"is" +c.x);
}
}



