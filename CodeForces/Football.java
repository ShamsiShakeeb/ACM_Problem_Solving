import java.util.*;

public class Football {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n=in.nextInt();
        String x;
        Set a = new HashSet();
        ArrayList b = new ArrayList();
        int count=0,count1=0;
        
        for(int i=0;i<n;i++){
            x=in.next();
            a.add(x);
            b.add(x);
            
        }
        Object ob[] = a.toArray(new Object[a.size()]);
        Object ob1[] = b.toArray(new Object[b.size()]);
        
      
        
        
       if(n==1){
            System.out.println(ob[0]);
            return;
        }
        else{
            for(int i=0;i<n;i++){
            if(ob1[i].equals(ob[0])){
                count++;
            }
            else if(ob1[i].equals(ob[1])){
                count1++;
            }
            }
        }
        
        if(count > count1){
            System.out.println(ob[0]);
        }
        else
            System.out.println(ob[1]);
        
    
    
    }
}