import java.util.Scanner;

public class NextRound {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        
        int k = in.nextInt();
        
        int count=0;
        
        int theArray[] = new int[n];
        
        
        for(int i=0;i<n;i++){
            theArray[i]=in.nextInt();
        }
        
        int lol=theArray[k-1];
        
        for(int i=0;i<n;i++){
            if(theArray[i] >= lol){
                if(theArray[i] > 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
