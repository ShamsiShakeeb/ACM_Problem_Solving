import java.util.ArrayList;
import java.util.Scanner;

public class CandyBags {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList a = new ArrayList();
        
        int z = in.nextInt();
        
        int n=z*z;
        
        for(int i=1;i<=n;i++){
            a.add(i);
          
        }
        
        Object ob[] = a.toArray(new Object[a.size()]);
        
        for(int i=0;i<a.size()/2;i++){
            System.out.print(ob[i] +" "+ob[(a.size()-1)-i]);
            System.out.println();
        }
       
    }
    
}