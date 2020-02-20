import java.util.Scanner;

public class GoldBatchsConjecture{
    
       public static boolean isPrime(long sex){
           
             int kabadi = (int)Math.pow(sex, 0.5)+1;
             for(int i=2;i<=kabadi;i++){
                 if(sex%i==0){
                     return false;
                 }
             }
             return true;
       }
    
    public static void main(String[] args){
        
          Scanner in = new Scanner(System.in);
          
          for(;;){
          
          long x = in.nextLong();
          if(x==0) break;
          
          int kabadi = (int)Math.pow(x, 0.5)+100;
          boolean svr=false;
          for(int i=3;i<=kabadi;i++){
              
                if(isPrime(i)){
                    if(isPrime(x-i)){
                        System.out.println(x+" = "+i+" + "+(x-i));
                        svr=true;
                        break;
                    }
                }
          }
          if(svr==false){
              System.out.println("Goldbach's conjecture is wrong.");
          }
    }
    }
}
