import java.util.Scanner;


public class BackToHighSchoolPhysics {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        
        while(in.hasNext()){
            
            int x = in.nextInt();
            
            int y = in.nextInt();
            
            System.out.println(x* (y*2));
        }
    }
    
}
