

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
    
    
     public static void main(String[] args){
         
         Scanner in = new Scanner(System.in);
         
         BigInteger a = in.nextBigInteger();
         
         BigInteger b = in.nextBigInteger();
         
         int n = in.nextInt();
         
         BigInteger sum=new BigInteger("0");
        
         for(int i=0;i<n-2;i++){
             
             sum=a.add(b.pow(2));
             a=b;
             b=sum;

            
             
         }
         System.out.println(sum);
         
     }
}
