import java.util.Scanner;

public class LuckyDivision {
    
 
    public static String div(int n){
        
        String arr[]={"1","2","3","5","6","8","9","0"};
      
           if(n%4==0)
               return "YES";
           else if(n%7==0){
               return "YES";
           }
        
           for(int i=4;i<=n;i++){
       
               if((String.valueOf(i).contains("4") && String.valueOf(i).contains("7")) && !(String.valueOf(i).contains(arr[0]) || String.valueOf(i).contains(arr[1]) || String.valueOf(i).contains(arr[2]) || String.valueOf(i).contains(arr[3]) || String.valueOf(i).contains(arr[4]) || String.valueOf(i).contains(arr[5]) || String.valueOf(i).contains(arr[6]) || String.valueOf(i).contains(arr[7]))){
                   if(n%i==0)      
                   return "YES";
               }
               else if((i%4==0) || (i%7==0)){
                   if(n%i==0)
                       return "YES";
               }
           }
             
           return "NO";
    }
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        boolean svr=false;
        
        String x[] = new String[9];
        int k=0;
        
        for(int i=0;i<10;i++){
            
            if(i == 4 || i==7){
               
            }
            else
            {
                x[k]=""+i;
                k++;
               
            }
        }
        
        if(n==0)
        {
          System.out.println("NO");
          return;
        }
        
        
        if((String.valueOf(n).contains("4") || String.valueOf(n).contains("7"))){
            for(int i=0;i<k;i++){
                if(String.valueOf(n).contains(x[i])){
                    svr=true;
                    break;
                   
                }
                else{
                    svr=false;
                }
            }
            if(svr==false){
                System.out.println("YES");
            }
            else if(svr==true){
                String res = div(n);
                System.out.println(res);
            }
        }
        else{
             String res = div(n);
             System.out.println(res);

        }
    }
}
