import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HrrorDash {
    
    public static void main(String[] args){
        
         Scanner in = new Scanner(System.in);
         
         int m = in.nextInt();
         
         for(int k=0;k<m;k++){
             
             ArrayList a = new ArrayList();
             
             int n = in.nextInt();
             
             for(int i=0;i<n;i++){
                 
                 int x = in.nextInt();
                 
                 a.add(x);
             }
             Collections.sort(a,Collections.reverseOrder());
             
             System.out.println("Case "+(k+1)+": "+a.get(0));
             
             a.clear();
             
         }
    }
}
