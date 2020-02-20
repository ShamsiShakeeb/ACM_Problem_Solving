import java.util.Scanner;

public class BoxGame{
    
    public static void main(String[] args){
        
       
        
        Scanner in = new Scanner(System.in);
        
     
       
         while(in.hasNext()){
             
               long x=in.nextLong();
        
             
             if(x==0) break;
             
             long me=1;
             
             while(me<x){
                 me=me*2+1;
             }
             if(me==x){
                 System.out.println("Bob");
             }
             else{
                 System.out.println("Alice");
             }
         }
    }
    
}
