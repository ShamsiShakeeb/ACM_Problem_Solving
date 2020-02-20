import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        String x = in.next();
        
        if(x.contains("H") || x.contains("Q") || x.contains("9")){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    
}
