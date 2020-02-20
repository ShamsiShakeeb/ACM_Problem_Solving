import java.util.Scanner;

public class ChatRoom {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        
        String x = in.next();
        
        char a[]=x.toCharArray();
        
        boolean a1=false,b1=false,c1=false,d1=false,e1=false;
        int count=0;
        
        m:  for(int i=0;i<a.length;i++){
            
            if(a[i]=='h'){
                a1=true;
                for(int j=i+1;j<a.length;j++){
                    if(a[j]=='e'){
                        b1=true;
                        for(int k=j+1;k<a.length;k++){
                            if(a[k]=='l'){
                                c1=true;
                                for(int l=k+1;l<a.length;l++){
                                    if(a[l]=='l'){
                                       d1=true; 
                                       for(int o=l+1;o<a.length;o++){
                                           if(a[o]=='o'){
                                               e1=true;
                                               System.out.println("YES");
                                               System.exit(0);
                                           }
                                       }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if(a1!=true && b1!=true&&c1!=true&&d1!=true&&e1!=true){
                count++;
                continue m;
            }
        }
        System.out.println("NO");
        
    }
    
}