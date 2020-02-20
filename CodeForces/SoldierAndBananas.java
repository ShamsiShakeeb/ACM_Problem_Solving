import java.util.Scanner;

public class SoldierAndBananas {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        long k = in.nextLong();
        
        long n = in.nextLong();
        
        long w = in.nextLong();
        
        long taka=0;
        
        for(long i=1;i<=w;i++){
            
            taka += k*i;
        }
       
        long res=taka-n;
        
        if(res>=0)
        System.out.println(res);
        else
        System.out.println(0);    
        
    }
}
