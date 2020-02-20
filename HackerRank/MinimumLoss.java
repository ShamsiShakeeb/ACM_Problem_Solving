import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MinimumLoss {
    
    public static void main(String[] args){
        
          Scanner in = new Scanner(System.in);
          
          int n = in.nextInt();
          
          HashMap<BigInteger , Integer> hm = new HashMap<>();
          
          BigInteger bg[] = new BigInteger[n];
          BigInteger temp[] = new BigInteger[n];
          for(int i=0;i<n;i++){
              
              bg[i]=in.nextBigInteger();
              temp[i]=bg[i];
              
              hm.put(bg[i], i);
 
          }
          Arrays.sort(bg);
          
          BigInteger rse = new BigInteger("10000000000000000000000000000");
          
          for(int i=0;i<n;i++){
              
              int kabadi = Arrays.binarySearch(bg, temp[i]);
              if(kabadi!=0){
                  int cena = kabadi-1;
                  if((int)hm.get(bg[kabadi])<(int)hm.get(bg[cena])){
                      
                  if(rse.compareTo(bg[kabadi].subtract(bg[cena]))>0){
                      rse=bg[kabadi].subtract(bg[cena]);
                  }
                  
                  }
              }
          }
          System.out.println(rse);
    }
    
}
