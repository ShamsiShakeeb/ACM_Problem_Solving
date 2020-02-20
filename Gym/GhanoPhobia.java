import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;


public class GhanoPhobia {
	public static void main(String[] args) throws Throwable{
		//BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader bf=new BufferedReader(new FileReader(new File("ghanophobia.in")));
		
		int t=Integer.parseInt(bf.readLine());
		int cnt=1;
		while(t-->0){
			String s=bf.readLine();
			String [] sa=s.split(":");
			int e=Integer.parseInt(sa[0]);
			int g=Integer.parseInt(sa[1]);
			
			if(e==6 && g==1){
				System.out.println("Case "+cnt+": "+"PENALTIES");
			}
			else
			if(e+1<g+6){
				System.out.println("Case "+cnt+": "+"NO");
			}else{
				if(e+1>g+6){
					System.out.println("Case "+cnt+": "+"YES");
				}
				else{
					if(g>1){
						System.out.println("Case "+cnt+": "+"NO");
					}else{
						System.out.println("Case "+cnt+": "+"YES");
					}
				}
			}
			cnt++;
		}
		
	}
}
