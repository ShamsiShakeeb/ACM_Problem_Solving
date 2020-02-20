import java.util.Scanner;

public class KeyRaces {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int s = in.nextInt();
        
        int x1=in.nextInt();
        
        int y1=in.nextInt();
        
        int x2=in.nextInt();
        
        int y2=in.nextInt();
        
        int first = s*x1 +(x2+x2);
        
        int sec = s*y1 +(y2+y2);
        
        if(first > sec){
            System.out.println("Second");
        }
        else if(first<sec){
            System.out.println("First");
        }
        else{
            System.out.println("Friendship");
        }
    }
    
}
