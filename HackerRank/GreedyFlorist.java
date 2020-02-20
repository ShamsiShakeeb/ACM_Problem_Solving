import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class GreedyFlorist {
    
    public static void main(String[] args){

          Scanner in = new Scanner(System.in);
          
          int n = in.nextInt();
          
          int k = in.nextInt();
          
          long x[] = new long[n];
          
          for(int i=0;i<n;i++){
              x[i]=in.nextLong();
          }
          Arrays.sort(x);
          
          BigInteger xy =new BigInteger("0");
          long sum=0;
          int count=0,set=1;
          
          for(int i=x.length-1;i>=0;i--){
              
               sum=((set)*x[i]);
               xy=xy.add(BigInteger.valueOf(sum));
               count++;
               if(count==k){
                   set++;
                   count=0;
               }
          }
          System.out.println(xy);
    }
    
}
