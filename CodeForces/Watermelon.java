import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Scanner;

public class Watermelon {
    
    public static void main(String[] args){
        
        
        Scanner in =new Scanner(System.in);
        
        int n = in.nextInt();
        ArrayList a = new ArrayList();
        boolean svr=true;
        
        for(int i=2;i<=n;i++){
            
            if(i%2==0){
                a.add(i);
            }
        }
        
        Object ob[] = a.toArray(new Object[a.size()]);
        
        for(int i=0;i<ob.length;i++){
            
            int k=abs(n-Integer.parseInt(String.valueOf(ob[i])));
            
            if(a.contains(k)){
                svr=false;
               
            }
        }
        if(svr==true){
            System.out.println("NO");
        }
        else
            System.out.println("YES");
        
          
    }
    
}
