import java.util.ArrayList;
import java.util.Scanner;

public class TanyaAndStairways {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int a[]=new int[n];
        
        int count=1;
        
        ArrayList list = new ArrayList();
        
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            if(a[i]>=a[i+1]){
                list.add(a[i]);
                count++;
               
            }
        }
     //   if(a[a.length-1]>=a[a.length-2]){
            list.add(a[a.length-1]);
      //  }
        
        System.out.println(count);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +" ");
        }
    }
    
}
