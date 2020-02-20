import java.math.BigInteger;
import java.util.Scanner;

public class SamAndSubstrings {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        String x = in.next();
        
        char a[] = x.toCharArray();
        
        int dp = Integer.parseInt(String.valueOf(a[0]));
        
        dp = (dp*10)+(Integer.parseInt(String.valueOf(a[1]))*2);
        
        int ans = Integer.parseInt(String.valueOf(dp)) + Integer.parseInt(String.valueOf(a[0]));
        
       // System.out.println(ans);
        
        BigInteger dp1 = new BigInteger(dp+"");
        BigInteger ans1 = new BigInteger(ans+"");
        BigInteger ten = new BigInteger("10");
        BigInteger modValue = new BigInteger(1000000007+"");
         for(int i=2;i<a.length;i++){
             
             BigInteger next = new BigInteger(a[i]+"");
             BigInteger index = new BigInteger((i+1)+"");
             
             dp1 = ((dp1.multiply(ten)).add((next.multiply(index)))).mod(modValue);

           //  dp = (dp*10)+(Integer.parseInt(String.valueOf(a[i]))*(i+1));
             
           //  ans+=dp;
             
             ans1 = (ans1.add(dp1)).mod(modValue);
         }
       
         System.out.println(ans1);
        
    }
    
}
