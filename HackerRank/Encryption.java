import java.util.ArrayList;
import java.util.Scanner;

public class Encryption {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        char[] y = x.toCharArray();
        String res="";
        for(int i=0;i<y.length;i++){
            if(y[i]!=' ')
            res+=y[i];
        }
        int root = (int)Math.pow(res.length(), 0.5);
        int koot=0;
        if(root*root ==  res.length()){
            koot=root;
        }
        else{
            koot=root+1;
        }
        if(root*koot<res.length()){
            root++;
        }
        char a[][] = new char[root][koot];
        char b[] = res.toCharArray();
        
        boolean svr=false;
        int count=0;
        for(int i=0;i<root;i++){
           
            for(int j=0;j<koot;j++){
                try{
                a[i][j]=b[count];
                count++;
                }
                catch(Exception e){
                   
                    svr=true;
                    break;
                }
                
            }
            if(svr){
                break;
            }
            
        }
        svr=false; ArrayList rol = new ArrayList();String x1="";
        for(int j=0;j<koot;j++){
            for(int i=0;i<root;i++){
                try{
                    if((int)a[i][j]!=0){
               // System.out.println(a[i][j]);
                x1+=(a[i][j]);}
                }
                catch(Exception e){
                    svr=true;break;
                }
            }
            if(svr==true){
                break;
            }
           
            rol.add(x1);
            x1="";
            
        }
      
      //  System.out.println(rol);
        for(int i=0;i<rol.size();i++){
            if(i==rol.size()-1){
                
               System.out.print(rol.get(i)+""); 
            }
            else
            System.out.print(rol.get(i)+" ");
        }
        
       
   
        
    }
    
}
