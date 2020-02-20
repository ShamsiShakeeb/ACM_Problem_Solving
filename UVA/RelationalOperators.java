import java.util.Scanner;
public class RelationalOperators {
    
    public static void main(String[] args){
        
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
         for(int i=0;i<n;i++){
             
             int k=in.nextInt();
             
             int j=in.nextInt();
             
             if(k>j){
                 System.out.println(">");
             }
           else  if(k<j){
                 System.out.println("<");
             }
             else
                 System.out.println("=");
             
         }
    }
    
}
