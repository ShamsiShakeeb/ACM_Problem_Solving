import java.util.Scanner;

public class TwoFashillows {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        
        int y = in.nextInt();
        
        int z = in.nextInt();
        
        String res="";
        
        if(x<y){
            System.out.println("good luck");
        }
        else{
            if((y+z)>x){
                System.out.println("see you next semester");
            }
            else
                 System.out.println("good luck");
        }
        
    }
    
}