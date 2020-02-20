import java.util.Scanner;

public class BracketSequence {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        
        String x = in.next();
        
        char a[] = x.toCharArray();
        
        int count=0;
        
        for(int i=0;i<a.length;i++){
            
            if(a[i]=='('){
                count++;
            }
            else{
                count--;
            }
            if(count<0){
                System.out.println("IMPOSSIBLE");
                return;
            }
        }
        
        System.out.print(x);
        
        for(int i=0;i<count;i++){
            System.out.print(")");
        }
        
    }
}
