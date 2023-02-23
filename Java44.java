import java.util.*;
public class Java43{
public static void main(String args[]){
//check if the length of array is grater than 0
if (args.length > 0)
{
  System.out.println("the command line" + "the argument is");
 
   for(String val:args)
   System.out.println(val);
   }
 else
 {
 System.out.println("no command line" + "argument found");
 }
 }
 }
