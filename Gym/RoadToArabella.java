import java.util.Scanner;

public class RoadToArabella {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        for(int i=0;i<t;i++){
            
            long x = in.nextLong();
            
            long y= in.nextLong();
            
            if((x-y==1 || x-y==0) && x%2==0){
                System.out.println("Ayoub");
            }
            else{
                System.out.println("Kilani");
            }
        }
    }
    
}