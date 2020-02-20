import java.util.Scanner;

public class SystemOfEquations {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int m = in.nextInt();
        
        int count=0,count1=0;
        
        int result=0;
        
        String pair1[]=new String[n+2];
        
        String pair2[]=new String[m+2];
        
        for(int i=0;i<=n;i++){
            
            int sqr = (i*i);
            
            if(sqr>n){
                break;
            }
            
            int res = n-(i*i);
            
            pair1[count]=i +" "+res;
            
            
            count++;
        }
        
        for(int i=0;i<=m;i++){
            
            int sqr1 = (i*i);
            
            if(sqr1>m){
                break;
            }
            
            int res1 = m-(i*i);
            
            pair2[count1]=res1 +" "+i;
            
            for(int j=0;j<count;j++){
                if(pair1[j].equals(pair2[count1])){
                    result++;
                }
            }
            
            count1++;
        }
        
        System.out.println(result);
        
       
    }
    
}
