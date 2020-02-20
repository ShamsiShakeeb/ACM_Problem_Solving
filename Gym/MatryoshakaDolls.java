import java.util.Scanner;

public class MatryoshakaDolls {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        long x = in.nextLong();
        
        long y = in.nextLong();
        int count=1;
        for(;;){

           x=x/y;
           if(x==0) break;
           count++; 

        }
        System.out.println(count);
       
    }
}