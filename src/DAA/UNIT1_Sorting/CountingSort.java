package DAA.UNIT1_Sorting;

import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String line = sc.nextLine();
        String[] parts = line.split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                System.out.print(i);
                count[i]--;

                if (count[i] > 0 || i < max) {
                    System.out.print(" ");
                }
            }
        }
    }
}
