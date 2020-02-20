import java.util.Scanner;

public class BirthdayPuzzle {
    
   
    static int count=0;
    static long sount=0;
   
    
     static void printSubsets(String set[]) 
    { 
        int n = set.length; 
  
        
        for (int i = 0; i < (1<<n); i++) 
        { 
            
          
            count=0;
           
            
            for (int j = 0; j < n; j++) {
  
               
                if ((i & (1 << j)) > 0) {
                     // System.out.print(set[j] +" ");
                      count|=Integer.parseInt(String.valueOf(set[j]));
                      
                   
                }
            }
         //   System.out.println(""); 
            sount+=count;
           
        }
        
    } 
    
    public static void main(String[] args){
        
        
        
        
      Scanner in = new Scanner(System.in); 
      int n = in.nextInt();
      String set[] = new String[n];
      for(int i=0;i<n;i++){
          set[i]=in.next();
      }
      
      printSubsets(set);
      System.out.println(sount);
      
       
    }
    
}