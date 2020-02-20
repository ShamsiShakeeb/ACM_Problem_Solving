import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kruskal(MST)ReallySpecialSubtree {
    
     public static void main(String[] args){
         
         Scanner in = new Scanner(System.in);
          int lol=0,sum=0;
          int node = in.nextInt();
        
          boolean svr=false;
          
          ArrayList a = new ArrayList();
          ArrayList b = new ArrayList();
         
          int e = in.nextInt(); 
         
          Sort s = new  Sort(node , e);
          int theArray[][] = new int[e+1][e+1];
          
          for(int i=0;i<e;i++){
          
          int x=in.nextInt();    int y=in.nextInt();     int z=in.nextInt();    
              
          s.v[i].src=x;
          s.v[i].des=y;
          s.v[i].weight=z; 
          theArray[x][y]=z;
        }
          
          Arrays.sort(s.v);
          
      //   System.out.println("-----");
         
        /* 1 3 3
3 2 4
1 2 5
3 4 5
4 1 6
2 4 7 */
          
         for(int i=0;i<e;i++){
             a.add(s.v[i].src);
             b.add(s.v[i].des);
            
        // System.out.println(s.v[i].src +" "+ s.v[i].des +" " + s.v[i].weight);
         }
         
         
          
          
         m:  for(int k=0;;k++){
             svr=false;
         CycleGraph graph = new  CycleGraph(node,e-lol);
          
         Object ob[] = a.toArray(new Object[a.size()]);
         Object ob1[] = b.toArray(new Object[b.size()]);
       
            
          for(int i=0;i<e-lol;i++){
          graph.edge[i].src=(int)ob[i];
          graph.edge[i].des=(int)ob1[i];
          }
          
          
         if(graph.connection(graph)==1){
       //  System.out.println(graph.count) ;
            
           a.remove(graph.count);
           b.remove(graph.count);
           lol++;
           svr=true;
         }
         if(svr==true){
             continue m;
         }
         else
             break;
         }
         for(int i=0;i<a.size();i++){
         sum+=theArray[(int)a.get(i)][(int)b.get(i)];
         }
         System.out.println(sum);
        
         
         
         }
     }

class CycleGraph{
    
    
    Edge edge[];
    int v,e;
     int count=0;
    
    class Edge{
        
        int src ,  des;
    }
    
    CycleGraph(int v , int e){
        
        this.v = v;
        this.e=e;
        
        
        edge = new Edge[e];
        
        for(int i=0;i<e;i++){
            edge[i]=new Edge();
        }
        
    }
    
    public int find(int parent[] , int i){
        
        if(parent[i]==-1){
            return i;
        }
        return find(parent,parent[i]);
         
    }
    
    public void union(int parent[] , int x , int y){
        
         int xset = find(parent , x);
         int yset = find(parent,y);
         
         parent[xset]=yset;
    }
    
    public int connection(CycleGraph graph){
        
        int parent[]=new int[v+1];
        
        for(int i=1;i<=v;i++){
            parent[i]=-1;
        }
        
         for(int i=0;i<e;i++){
            
            int x = find(parent,edge[i].src);
            int y = find(parent,edge[i].des);
            
            if(x==y){
             // System.out.println("Cycle Detacted");
              return 1;
               
            }
            else{
                count++;
               // System.out.println(x +" "+y);
            }
           
            union(parent,x,y);
            
        }
         return 0;
    }
}
class Sort{
    
    vertex v[];
    
     Sort(int node , int ver){
        
        v = new vertex[ver];
        
        for(int i=0;i<ver;i++){
            v[i]=new vertex();
        }
    }
    
    class vertex implements Comparable<vertex> {

        int weight,src,des;
       
        public int compareTo(vertex o) {
           
            return this.weight - o.weight;
        }
        
    }
    
   
}
