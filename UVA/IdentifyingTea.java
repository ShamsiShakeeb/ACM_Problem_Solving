import java.util.Scanner;

public class IdentifyingTea {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int count=0;
       
        
        boolean svr=false;
        
        int theArray[]=new int[5];
        
        while(in.hasNext()){
            
       int T = in.nextInt();
        
        for(int i=0;i<=4;i++){
            theArray[i]=in.nextInt();
           
            if(T==theArray[i]){
                count++;
            }
        }
        System.out.println(count);
        count=0;
        
    }
    }
}
