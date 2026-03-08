package DAA.UNIT2;
import java.util.*;
public class PrimAlgorithm {
    static int minKey(int key[], boolean mst[], int v){
        int min = Integer.MAX_VALUE;
        int index = -1;

        for(int i=0;i<v;i++){
            if(!mst[i] && key[i] < min){
                min = key[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();

        int graph[][] = new int[v][v];

        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                graph[i][j] = sc.nextInt();
            }
        }

        int key[] = new int[v];
        boolean mst[] = new boolean[v];

        Arrays.fill(key, Integer.MAX_VALUE);

        key[0] = 0;

        int totalCost = 0;

        for(int count=0; count<v; count++){

            int u = minKey(key, mst, v);

            mst[u] = true;

            totalCost += key[u];

            for(int j=0;j<v;j++){

                if(graph[u][j] != 0 && !mst[j] && graph[u][j] < key[j]){
                    key[j] = graph[u][j];
                }

            }
        }

        System.out.println(totalCost);
    }
}