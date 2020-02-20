import java.util.Scanner;

public class Egypt {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
            
          long x = in.nextLong();
           
           long y = in.nextLong();
           
           long z = in.nextLong();
           
           if(x==0 && y==0 && z==0){
               break;
           }
            
           if((x*x)+(y*y)==(z*z)){
               System.out.println("right");
           }
           else if((x*x)+(z*z)==(y*y))
               System.out.println("right");
           
           else if((y*y)+(z*z)==(x*x))
               System.out.println("right");
           
           else
               System.out.println("wrong");
        }
        
    }
    
}