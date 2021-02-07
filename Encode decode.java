/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static String decode (int a){
         int decimal = 0, weight = 1;
    while (a != 0)
    {
        int rem = a % 10;
        decimal += rem * weight;
        binary /= 10;
        weight *= 2;
    }
      return decimal;
    }   
    
    
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    
	    char[]a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
	    int T = sc.nextInt();
	    while(T>0){
	        int N = sc.nextInt();
	        int a[] = new Int[N];
	        for(int i=0;i<N;i++)
	        a[i]=sc.nextInt();
	        
	        System.out.println(decode(a));
	        
	    }
	    
	}
    
}