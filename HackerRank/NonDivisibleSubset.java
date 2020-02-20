import java.util.Scanner;

public class NonDivisableSubSet {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        int k =in.nextInt();
        
        int t[] = new int[k];
 
        long a[]  = new long[n];
        
        for(int i=0;i<n;i++){
            
            
            a[i]=in.nextLong();
           // System.out.print(a[i]%k +" ");
            t[(int)a[i]%k]+=1;
        }
        if(t[0]!=0){
        t[0]=1;}
        boolean svr=false;
        try{
            if(k%2==0){
                svr=true;
            t[k/2]=1;}
        }
        catch(Exception e){
            svr=false;
        }
       int sum=0;
       int ind=k-1;
       
       for(int i=1;i<k;i++){
           
             if(i>=ind) break;
             
             if(t[i]>t[ind]){
                 sum+=t[i];
             }
             else{
                 sum+=t[ind];
             }
             ind--;
       }
       
       if(svr==true)
       System.out.println(sum+t[0]+t[k/2]);
       else{
          System.out.println(sum+t[0]);
       }
       
    }
}
