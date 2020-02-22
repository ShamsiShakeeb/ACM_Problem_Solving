/// 0 Points


import java.util.Scanner;

public class StockMaximize {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int TS=0;TS<t;TS++){
        int n= in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        long profit=0; int kabadi=arr[n-1];
        for(int i=n-2;i>=0;i--){
            
            if(kabadi>arr[i]){
                profit+=kabadi-arr[i];
            }
            else{
                kabadi=arr[i];  
            }
           // System.out.println(kabadi);
        }
        System.out.println(profit);
    }
    }
    
}
