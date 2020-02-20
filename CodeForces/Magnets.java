import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Magnets {
    
    public static void main(String[] args){
        
        
         Scanner in = new Scanner(System.in);
         int count=0;
         boolean svr=true;
          boolean svr1=false;
         int n = in.nextInt();
         ArrayList a = new ArrayList();
         
         for(int i=0;i<n;i++){
             String x=in.next();
             
             
             if(x.charAt(0)=='1' && x.charAt(1)=='0'){
                 if(svr==true){  
                 count++; 
                 a.add(count);}
                 svr=false;
                 svr1=false;
                  
             }
             else if(x.charAt(0)=='0' && x.charAt(1)=='1'){
                    if(svr1==false){
                    count++;
                    a.add(count);}
                    svr=true;
                    svr1=true;
             }
         }
         Collections.sort(a,Collections.reverseOrder());
         System.out.println(a.get(0));
    }
    
}