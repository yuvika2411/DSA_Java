package DAA.UNIT2;
import java.util.*;

public class DijkstraAlgorithm {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int v= sc.nextInt();
        int e= sc.nextInt();

        int g[][]= new int[v][v];

        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d= sc.nextInt();
            int w= sc.nextInt();

            g[s][d]=w;
            g[d][s]=w;
        }

        int start=sc.nextInt();

        int[] dist= new int[v];
        boolean[] visited= new boolean[v];

        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[start]=0;

        for(int i=0;i<v;i++){
            int min= Integer.MAX_VALUE;
            int u=-1;

            for(int j=0;j<v;j++){
                if(!visited[j] && dist[j]<min){
                    min=dist[j];
                    u=j;
                }
            }

            visited[u]= true;

            for(int k=0;k<v;k++){
                if(!visited[k] && g[u][k]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+g[u][k]<dist[k]){
                    dist[k]= dist[u]+ g[u][k];
                }
            }
        }

        for(int i=0;i<v;i++){
            System.out.println(i+" "+dist[i]);
        }
    }
}
