import java.util.Scanner;

public class ConstructTheArray {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int k = in.nextInt();
        
        int x = in.nextInt();
        
        long a[] = new long[n];
        
        long b[] = new long[n];
        
        if(x==1){
            a[0]=1;
            b[0]=0;
        }
        else{
            a[0]=0;
            b[0]=1;
        }
        for(int i=1;i<n;i++){
            
              a[i]=(b[i-1])%1000000007;
              b[i]=(a[i-1]*(k-1)+b[i-1]*(k-2))%1000000007;
        }
        System.out.println(a[n-1]);
        
    }
    
}
