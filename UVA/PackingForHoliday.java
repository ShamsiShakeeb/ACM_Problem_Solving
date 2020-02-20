import java.util.Scanner;


public class PackingForHoliday {

    
    public static void main(String[] args) {
        
           Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            int y=in.nextInt();
            int z=in.nextInt();
            
            if(x<=20 && y<=20 && z<=20){
                System.out.println("Case "+(i+1) +": "+"good");
            }
            else
                System.out.println("Case "+(i+1) +": "+"bad");
        }
    }
    
}
