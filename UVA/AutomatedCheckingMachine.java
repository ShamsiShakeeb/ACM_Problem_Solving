import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AutomatedCheckingMachine {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        Object ob[] = {0,1,2,3,4};
        
        ArrayList a = new ArrayList();
        
        while(in.hasNext()){
        
        for(int i=0;i<5;i++){
            int x = in.nextInt();
            if(x==1)
            a.add(i);
        }
         for(int i=0;i<5;i++){
            int y = in.nextInt();
            if(y==1)
            a.add(i);
        }
         Collections.sort(a);
         Object ob1[]=a.toArray(new Object[a.size()]);
        // System.out.println(a);
         
         if(Arrays.equals(ob, ob1)){
             System.out.println("Y");
         }
         else{
             System.out.println("N");
         }
         a.clear();
        
    }
    }
}
