import java.util.Scanner;

public class HajjEAkbar {
    
    
    public static void main(String[] args){
        
        
        Scanner in = new Scanner(System.in);
        
        int i=0;
        
        while(in.hasNext()){
            
       
            String x = in.next();
            
            i++;
            
            if(x.equals("Hajj")){
                System.out.printf("Case %d: Hajj-e-Akbar\n",i);
            }
            else if(x.equals("Umrah")){
                System.out.printf("Case %d: Hajj-e-Asghar\n",i);
            }
            else if(x.endsWith("*")){
                break;
            }
        }
        
        
    }
    
}
