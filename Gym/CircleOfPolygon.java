import java.util.Scanner;


public class CircleOfPolygon {
    
   
    
    public static void main(String[] args){
   
        Scanner in = new Scanner(System.in);
        
        double a = in.nextDouble();
        
        double b = in.nextDouble();
        
        double r = b/(2*Math.sin(Math.PI/a));
        double lol = Math.pow(r, 2);
        System.out.println(Math.PI*lol);
    }
    
}
