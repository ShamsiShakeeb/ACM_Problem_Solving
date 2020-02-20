import java.util.HashSet;
import java.util.Scanner;

public class SkypeTalks {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        HashSet  put = new HashSet();
        
        HashSet keep = new HashSet();
        
        int n = in.nextInt();
        
        for(int i=0;i<n;i++){
        
        String x = in.next();
        
        if(!x.equals("0")){
        
        if(put.add(x)==false){
            if(keep.add(x)==false){
                System.out.println("-1");
                return;
            }
        }
        }
        }
        System.out.println(keep.size());
    }
    
}