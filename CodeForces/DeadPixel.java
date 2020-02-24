import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DeadPixel {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        for(int j=0;j<t;j++){
        
        int k = in.nextInt();
        
        int g = in.nextInt();
        
        int l = in.nextInt();
        
        int o = in.nextInt();
        
        ArrayList<Integer> lol = new ArrayList();
       
        lol.add(k*(abs(o-g+1)));
        lol.add(g*(abs(l-k+1)));
        lol.add(k*o);
        lol.add(g*l);
      //   list.add(a*((b+1)-y));
      //  list.add(b*((a+1)-y));
        
        Collections.sort(lol);
        
        System.out.println(lol.get(lol.size()-1));
        }
    }
    
}
