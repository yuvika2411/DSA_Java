package DAA.UNIT2;
import java.util.*;

public class JobScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char job[] = new char[n];
        int deadline[] = new int[n];
        int profit[] = new int[n];

        for(int i=0;i<n;i++){
            job[i] = sc.next().charAt(0);
            deadline[i] = sc.nextInt();
            profit[i] = sc.nextInt();
        }

        // profit ke basis par sorting (descending)
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(profit[j] < profit[j+1]){

                    int t = profit[j];
                    profit[j] = profit[j+1];
                    profit[j+1] = t;

                    t = deadline[j];
                    deadline[j] = deadline[j+1];
                    deadline[j+1] = t;

                    char c = job[j];
                    job[j] = job[j+1];
                    job[j+1] = c;
                }
            }
        }

        int slot[] = new int[n];
        Arrays.fill(slot,-1);

        int total = 0;

        // job scheduling
        for(int i=0;i<n;i++){
            for(int j=Math.min(n,deadline[i])-1;j>=0;j--){
                if(slot[j]==-1){
                    slot[j]=i;
                    total+=profit[i];
                    break;
                }
            }
        }

        // selected jobs print
        for(int i=0;i<n;i++){
            if(slot[i]!=-1){
                System.out.print(job[slot[i]]+" ");
            }
        }

        System.out.println();
        System.out.println(total);
    }
}
