import java.util.Scanner;
public class MaratonIMEGoesRowing {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        String x  = in.next();
        
        char a[] = x.toCharArray();
        
        int count=0;
        
        for(int i=0;i<a.length;i++){
            
            if(a[i]=='A'){
                count++;
            }
            else{
                count--;
                if(count<0){
                    break;
                }
            }
            
        }
        if(count==0){
            System.out.println("Sim");
            
        }
        else{
            System.out.println("Nao");
        }
        
    }
    
}