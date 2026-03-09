package DAA.UNIT2;
import java.util.*;

public class KruskalAlgorithm {
    static int find(int parent[], int i){
        while(parent[i] != i)
            i = parent[i];
        return i;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        int u[] = new int[E];
        int v[] = new int[E];
        int w[] = new int[E];

        for(int i=0;i<E;i++){
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }


        for(int i=0;i<E-1;i++){
            for(int j=i+1;j<E;j++){
                if(w[i] > w[j]){
                    int temp=w[i]; w[i]=w[j]; w[j]=temp;
                    temp=u[i]; u[i]=u[j]; u[j]=temp;
                    temp=v[i]; v[i]=v[j]; v[j]=temp;
                }
            }
        }
        int parent[] = new int[V];
        for(int i=0;i<V;i++)
            parent[i]=i;

        int cost=0, count=0;

        for(int i=0;i<E && count<V-1;i++){
            int x=find(parent,u[i]);
            int y=find(parent,v[i]);

            if(x!=y){
                System.out.println(u[i]+" "+v[i]+" "+w[i]);
                cost+=w[i];
                parent[x]=y;
                count++;
            }
        }
        System.out.println(cost);
    }
}
