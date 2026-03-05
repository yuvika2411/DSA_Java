package DAA.UNIT1_Sorting;

import java.util.Scanner;

public class RadixSort {

    static int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    static void countSort(int arr[], int n, int pos) {
        int output[] = new int[n];
        int count[] = new int[10];

        for (int i = 0; i < n; i++)
            count[(arr[i] / pos) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / pos) % 10] - 1] = arr[i];
            count[(arr[i] / pos) % 10]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    static void radixSort(int arr[], int n) {
        int max = getMax(arr, n);

        for (int pos = 1; max / pos > 0; pos = pos * 10)
            countSort(arr, n, pos);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        radixSort(arr,n);

        System.out.print(arr[0]);
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
