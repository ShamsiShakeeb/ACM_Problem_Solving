
import java.util.ArrayList;
import java.util.Scanner;


public class ThePowerSum {
   
     static int pow1;
     
     static int[] put(int arr[]){
         
         ArrayList<Integer> list = new ArrayList();

         for(int i=1;i<arr.length;i++){
             list.add(arr[i]);
         }
         
         int put1[] = new int[list.size()];
         for(int i=0;i<list.size();i++){
             put1[i]=list.get(i);
         }
         return put1;
         
     }
     
     static int lol(int arr[] , int n){
         
          if(n==0){
              return 1;
          }
          else if(arr.length==0){
              
              return 0;
          }
          else if(n<0){
              return 0;
          }

          int sex=arr[0]; 
          int kabadi[]=put(arr);
         

          return lol(kabadi,n)+lol(kabadi,n-((int)Math.pow(sex, pow1)));
     }
    
    public static void main(String[] args){
        
          Scanner in = new Scanner(System.in);
          int n=in.nextInt();
          pow1=in.nextInt();
          int arr[] = new int[(int)Math.pow(n, 0.5)+1];
          for(int i=1;i<=arr.length;i++){
              arr[i-1]=i;
          }
       
          
          System.out.println(lol(arr,n));
         
        
         
         
        
    }
    
}
