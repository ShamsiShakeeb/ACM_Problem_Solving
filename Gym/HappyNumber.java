import java.util.Scanner;


public class HappyNumber {
    
    
       public static String kabadi(String x){
           
           char a[]=x.toCharArray();
           
           int value=0;
           
           for(int i=0;i<a.length;i++){
               
               value += Double.parseDouble(String.valueOf(a[i]))*Double.parseDouble(String.valueOf(a[i])); 
           }
           
           return String.valueOf(value);
       }
    
     public static void main(String[] args){
         
         Scanner in = new Scanner(System.in);
         
         String x = in.next();
         
       
         
         for(;;){
         
         x=kabadi(x);
         
       //  System.out.println(x);
         
         if(x.equals("1")){
             System.out.println("HAPPY");
             break;
         }
         else if(x.equals("4")){
             System.out.println("UNHAPPY");
             break;
         }
         else{
             
             kabadi(x);
         }
         }
     }
}