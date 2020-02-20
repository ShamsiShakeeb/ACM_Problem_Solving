import java.util.ArrayList;
import java.util.Scanner;

public class CheckTheText {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        String x[] = new String[n];
        
        String kabadi="";
        
        for(int i=0;i<n;i++){
            
            x[i]=in.next();
            
            if(i==n-1){
                kabadi+=x[i];
            }
            else
            kabadi+=x[i]+" ";
        }
        ArrayList list = new ArrayList();
        
        int k = in.nextInt();
        
        boolean up=false,down=false;
        
        for(int i=0;i<k;i++){
            
            
            String lol = in.next();
 
            if(lol.equals("Space")){
                list.add(' ');
            }
            else if(lol.equals("CapsLock")){
             
                   if(up==false){
                   up=true;}
                   else{
                       up=false;
                   }
            }
            else if(lol.equals("Backspace")){
                  try{
                  list.remove(list.size()-1);
                  }
                  catch(Exception e){
                      
                  }
            }
            else{
                if(up){
                    list.add(lol.toUpperCase());
                }
                else{
                    list.add(lol.toLowerCase());
                }
            }
        }
       
         String ans="";
         
         for(int i=0;i<list.size();i++){
             ans+=list.get(i);
         }
         if(ans.equals(kabadi)){
             System.out.println("Correct");
         }
         else{
             System.out.println("Incorrect");
         }
         
       
    }
    
}
