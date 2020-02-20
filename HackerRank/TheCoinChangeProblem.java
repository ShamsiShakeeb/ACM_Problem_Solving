
import java.util.Arrays;

import java.util.Scanner;

public class TheCoinChangeProblem {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int am = in.nextInt();
        
        int n = in.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            
            arr[i]=in.nextInt();
                
        }
        Arrays.sort(arr);
        
        long temp[][]=new long[arr[arr.length-1]+1][am+1];
        
       // ArrayList but = new ArrayList();
       
       long bagha = -1;
        
        for(int i=0;i<n;i++){
            temp[arr[i]][0]=1;
        }
        for(int i=1;i<=am;i++){
            try{
                temp[arr[0]][i]=temp[arr[0]][i-arr[0]];
                //but.add(temp[arr[0]][i]);
                if(bagha < temp[arr[0]][i]){
                    bagha = temp[arr[0]][i];
                }
            }
            catch(Exception e){
                
            }
        }
      
        for(int k=1;k<n;k++){
         for(int i=1;i<=am;i++){
            try{
                temp[arr[k]][i]=temp[arr[k]][i-arr[k]]+    temp[arr[k-1]][i];
               // but.add(temp[arr[k]][i]);
                if(bagha <  temp[arr[k]][i]){
                    bagha = temp[arr[k]][i];
                }
            }
            catch(Exception e){
                 try{
                 temp[arr[k]][i]= temp[arr[k-1]][i];
                
                 if(bagha <  temp[arr[k]][i]){
                    bagha = temp[arr[k]][i];
                }
                 
                 }
                 catch(Exception j){
                     
                 }
            }
        }
        }
        
        
        System.out.println(temp[arr[n-1]][am]);
    }
}