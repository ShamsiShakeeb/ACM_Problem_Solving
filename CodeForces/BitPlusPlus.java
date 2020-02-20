import java.util.Scanner;

public class BitPlusPlus {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int x=0;
        
        for(int i=0;i<n;i++){
            
            String op = in.next();
            
            if(op.contains("++")){
                x++;
            }
            else if(op.contains("--")){
                x--;
            }
        }
        System.out.println(x);
    }
    
}
