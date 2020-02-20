import static java.lang.Math.abs;
import java.util.Scanner;

public class HashMatTheBraveWarrior {
    
    
    public static void main(String[] args){
        
        
        Scanner in = new Scanner(System.in);
        
        
        while(in.hasNext()){
            
            long x = in.nextLong();
            
            long y = in.nextLong();
            
            long z = abs(y-(x));
            
            System.out.println(z);
        }
        
    }
    
}
