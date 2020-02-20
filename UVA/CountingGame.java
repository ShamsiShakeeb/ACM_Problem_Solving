import java.util.Scanner;

public class CountingGame{
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
            
            int n = in.nextInt();
            
            int me=1;
            
            int count=0;
            
            boolean svr=false;
            
            int m = in.nextInt();
            
            int k = in.nextInt();
            
            if(n==0 && m==0 && k==0) break;
            
            int c=0;
            m:  for(int h=0;;h++){ 
                if(svr==true) break;
                
            for(int i=me;i<=n;i++){
             
                c++; 
              //  System.out.println(i +" "+c);
                if(i==m){
                    if(c%7==0 || String.valueOf(c).contains("7")){
                   // System.out.println(i +" "+c);
                    count++;
                    
                    if(count==k){
                        System.out.println(c);
                        svr=true;
                        continue m;
                    }
                    }
                }
                if(i==n){
                    for(int j=n-1;j>=1;j--){
                         c++;
                        // System.out.println(j +" "+c);
                        if(j==m){
                             if(c%7==0 || String.valueOf(c).contains("7")){
                      //  System.out.println(j +" "+c);}
                             count++;
                             if(count==k){
                                System.out.println(c);
                                svr=true;
                                 continue m;
                             }
                        }
                        
                    }
                         me=2;
                }
            }
            }
            
        }
    }
    
}
}