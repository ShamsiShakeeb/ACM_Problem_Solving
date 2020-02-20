import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoPalindrome {
    
    public static void main(String[] args){
        
        
        Scanner in = new Scanner(System.in);
        
        String x = in.next();
        
        String y = in.next();
        
        String z = x+""+y;
        
        int lol=0;
        
        int count=0;
        
        boolean svr=false;
        
        if(z.length()%2==0){
            
            char a[] = z.toCharArray();
            
            Set hs = new HashSet();
            
            for(int i=0;i<z.length();i++){
                
                hs.add(a[i]);
            }
            
            Object ob[]= hs.toArray(new Object[hs.size()]);
            
            for(int j=0 ; j<ob.length ;j++){
                
                for(int k=0;k<z.length();k++){
                    
                    if(a[k]==(char)(ob[j])){
                        count++;
                    }  
                }
                 if(count%2!=0){
                        svr=true;
                        break;
                    }
                
                    count=0;
            }
            if(svr==false){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            
            char a[] = z.toCharArray();
            
            Set hs = new HashSet();
            
            for(int i=0;i<z.length();i++){
                
                hs.add(a[i]);
            }
            
            Object ob[]= hs.toArray(new Object[hs.size()]);
            
            for(int j=0 ; j<ob.length ;j++){
                
                for(int k=0;k<z.length();k++){
                    
                    if(a[k]==(char)(ob[j])){
                        count++;
                    }  
                }
              
                 if(count%2!=0){
                        lol++;
                      
                        if(lol==2){
                            svr=true;
                        break;}
                    }
                 
                    count=0;
            }
            if(svr==false){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
