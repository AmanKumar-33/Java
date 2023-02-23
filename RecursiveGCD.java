import java.util.*;
public class RecursiveGCD{
int m,n;
int gcd(int m,int n){      //greatest comman factor of two integer
if (m>n)
return gcd(n,m);
if (m==n)
return m;
if(m==0)
return n;
if(m==1)
return 1;
return gcd(m,n%m);
}


public static void main (String[] args){
  RecuresiveGCD s = new RecursiveGCD();
  s.m = Integer.ParseInt(args[0]);
  s.n = Integer.ParseInt(args[1]);
  System.out print("GCD of %d and %d is %d" s.m , s.n , s.gcd(s.m, s.n) );
  }
 }

