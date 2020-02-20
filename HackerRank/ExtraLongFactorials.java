import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
       BigInteger bg;
       
       BigInteger mul = new BigInteger("1");
        
        for(int i=1;i<=n;i++){
            bg=new BigInteger(String.valueOf(i));
            mul=mul.multiply(bg);
        }
        System.out.println(mul);
                
    }
}
