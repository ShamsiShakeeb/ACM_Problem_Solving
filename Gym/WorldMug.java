import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Scanner;

public class WorldMug {
    
       static ArrayList ab[];
        static int count=0;
        static long sum=0;
       public static void kabadi(ArrayList a){
           
            if(ab[count].size()==1){
                 
                  System.out.println(sum);
                  System.exit(0);
             }
            
             count++;
             for(int i=0;i<a.size();i++){
                 
                 sum+=abs((long)a.get(i)-(long)a.get(i+1));
                 
                 if((long)a.get(i)>(long)a.get(i+1)){
                     ab[count].add((long)a.get(i));
                   
                 }
                 else{
                     ab[count].add((long)a.get(i+1));
                 }
                   i++;
             }
            
           // System.out.println(ab[count]);
            
       }
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
          ab = new ArrayList[(n/2)+1];
        
        for(int i=0;i<(n/2)+1;i++){
            ab[i]=new ArrayList();
        }
       
        for(int i=0;i<n;i++){
            long x = in.nextLong();
            ab[count].add(x);
        }
        
        for(;;){
             
            kabadi(ab[count]);
            
        }
    }
}