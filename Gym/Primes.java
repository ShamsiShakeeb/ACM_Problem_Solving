import java.util.Scanner;

public class Primes {
    
      public static boolean isPrime(int x){
          
          
          if(x==0 || x==1){
              return false;
          }
  
           if(x==2 || x==3){
               return true;
           }
          
            int kabadi = ((int)Math.pow(x, 0.5))+1;
            boolean svr=true;
            for(int i=2;i<=kabadi;i++){
                if(x%i==0){
                    return false;
                }
            }
            return svr;
      }
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
      //  System.out.println(isPrime(671));

        int kabadi = ((int)Math.pow(n, 0.5))+1;
        
        for(int i=2;i<=kabadi;i++){
             
            if(isPrime(i)){
               
                int ans=n-i;
                if(isPrime(ans)){
                    System.out.println(i +" "+ans);
                    return;
                }
            }
            
        }
        System.out.println("-1");
       
        
    }
    
}