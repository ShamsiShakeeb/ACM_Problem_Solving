import java.math.BigInteger;
import java.util.Scanner;

public class IfWeWereChildAgain {
    
    public static void main(String[] args){
        
        
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
            
            String x = in.next();
            
            String op = in.next();
            
            String y = in.next();
            
            BigInteger a = new BigInteger(x);
            
            BigInteger b = new BigInteger(y);
            
            if(op.equals("/")){
                System.out.println(a.divide(b));
            }
            else
                System.out.println(a.mod(b));
            
        }
    }
    
}