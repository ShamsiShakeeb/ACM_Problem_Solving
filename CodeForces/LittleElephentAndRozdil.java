import java.util.Arrays;
import java.util.Scanner;


public class LittleElephentAndRozdil {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int theArray[] = new int[n];
        
        int temp[] = new int[n];
        
        int count=0;
        
        int res=0;
        
        for(int i=0;i<n;i++){
            
            theArray[i]=in.nextInt();
            temp[i]=theArray[i];
        }
        Arrays.sort(theArray);
        
        for(int i=0;i<n;i++){
           
               if(theArray[0]==temp[i]){
                   
                   count++;
                   if(count==2){
                       break;
                   }
                   
                   res=i;
               }
        }
        if(count==1){
            System.out.println(res+1);
        }
        else
            System.out.println("Still Rozdil");
        
    }
    
}