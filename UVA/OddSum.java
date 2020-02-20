import java.util.Scanner;

public class OddSum {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        for(int i=0;i<t;i++){
            
            int a = in.nextInt();
            
            int k = in.nextInt();
            
            int sum=0;
            
            if(a%2==0){
                a++;
            }
            
            if(k%2==0){
                k--;
            }
            
            for(int j=a;j<=k;j+=2){
                
                sum+=j;
            }
            
            System.out.printf("Case %d: %d\n",i+1,sum);
        }
    }
    
}