import java.util.*;
public class Java48{
int m,n;
int gcd(int m,int n){
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

//greatest comman factor of two integer
 Public static void main (String args[]){
  RecuresiveGCD g = new RecursiveGCD();
  g.m = Integer.ParseInt(args[0]);
  g.n = Integer.ParseInt(args[1]);
  system.out println(" Gcd of %d and %d is %d",g.m,g.n,g.gcd(g.m, g.n);
  }
 }
 
