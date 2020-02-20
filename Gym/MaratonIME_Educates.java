import java.util.Scanner;

public class MaratonIME_Educates {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int sum=0;
        
        for(int i=0;i<n;i++){
            
             int x=in.nextInt();
             
             sum+=x;
            
        }
        
        int z = sum%5;
        
        if(z==0){
            System.out.println(sum/5);
        }
        else{
             System.out.println((sum/5)+1);
        }
    }
    
}
