import java.util.HashSet;
import java.util.Scanner;

public class BeautifullYear {
    
    static String xy;
    
    public static boolean nextY(String x){
        
        boolean svr=true;
        
        char a[]=x.toCharArray();
        
        HashSet h = new HashSet();
        
        for(int i=0;i<a.length;i++){
           if(h.add(a[i])==false){
               int nextYr = Integer.parseInt(String.valueOf(x))+1;
               xy = String.valueOf(nextYr);
               svr=false;
           }
        }
        return svr;
    }
    
    
    public static void main(String[] args){
        
        
        Scanner in = new Scanner(System.in);
        
        String year = in.next();
        
        int lol = Integer.parseInt(String.valueOf(year))+1;
        
        year = String.valueOf(lol);
       
        xy=year;
      
           
       for(;;){
                
            if(nextY(xy)==true){
                System.out.println(xy);
                break;
            }
            
        }
       
       
    }
}
