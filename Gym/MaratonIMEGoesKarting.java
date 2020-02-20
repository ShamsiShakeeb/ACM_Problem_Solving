import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class  MaratonIMEGoesKarting {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int theArray[] = new int[n];
        
        ArrayList b = new ArrayList();
        
        ArrayList a = new ArrayList();
        
        for(int i=0;i<n;i++){
            theArray[i]=in.nextInt();
            a.add(theArray[i]);
            b.add(theArray[i]);
            
        }
        Collections.sort(a);
        Arrays.sort(theArray);
   
        
        a.remove(a.size()-1);
        
        if(a.contains(theArray[theArray.length-1])){
            System.out.println(-1);
        }
        else
        {
            System.out.println(b.indexOf(theArray[theArray.length-1])+1);
        }
        
    }
    
}
