package DAA.UNIT2;
import java.util.*;

public class ActivitySelection {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int start[]= new int[n];
        int end[]= new int[n];

        for(int i=0;i<n;i++){
            start[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            end[i]=sc.nextInt();
        }

        int activities[][]= new int[n][2];
        for(int i=0;i<n;i++){
            activities[i][0]= start[i];
            activities[i][1]= end[i];
        }

        Arrays.sort(activities,(a,b)-> a[1]-b[1]);

        int count=0;
        int lastEnd=-1;

        for(int i=0;i<n;i++){
            if(activities[i][0]>lastEnd){
                count++;
                lastEnd= activities[i][1];
            }
        }

        System.out.println(count);
    }
}
