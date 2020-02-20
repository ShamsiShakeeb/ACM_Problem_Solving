import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ExactSum {
    
    
    public static void main(String[] args){
        
        
        Scanner in = new Scanner(System.in);
       
        
        while(in.hasNext()){
      
        int  n = in.nextInt();
        
        int a[]=new int[n+1];
        
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int mon = in.nextInt();
        ArrayList list = new ArrayList();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int ans = a[i]+a[j];
                if(ans==mon){
                list.add(a[i]);
                list.add(a[j]);
                }
            }
        }
        
        int bagha=999999999;
        int pak=0;
        int bng=0;
        for(int i=0;i<list.size()-1;i++){
            int dif = abs((int)list.get(i)-(int)list.get(i+1));
            if(bagha>dif){
                bagha=dif;
                pak=(int)list.get(i);
                bng=(int)list.get(i+1);
            }
            
            i++;
        }
        if(bng<pak)
        System.out.println("Peter should buy books whose prices are "+bng+ " and "+pak+".");
        else{
            System.out.println("Peter should buy books whose prices are "+pak+ " and "+bng+"."); 
        }
        System.out.println();
       
        
      
        }
    
    }
    
}