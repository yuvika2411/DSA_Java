package DAA.UNIT1_Sorting;
import java.util.*;

public class BucketSort {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]= new float[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextFloat();
        }


        ArrayList<Float>[] buckets= new ArrayList[n];
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<>();
        }

        for(int i=0;i<n;i++){
            int index= (int)(arr[i]*n);
            buckets[index].add(arr[i]);
        }

        for(int i=0;i<n;i++){
            Collections.sort(buckets[i]);
        }

        int k=0;
        for(int i=0;i<n;i++){
            for(float num:buckets[i]){
                arr[k++]=num;
            }
        }

        System.out.printf("%.2f",arr[0]);
        for(int i=1;i<n;i++){
            System.out.printf(" %.2f",arr[i]);
        }
    }
}
