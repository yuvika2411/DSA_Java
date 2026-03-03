package Sorting;
import java.util.*;
public class ShellSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s= sc.nextLine();

        String str[]= s.split(" ");
        int arr[]= new int[n];
        for(int i=0;i<str.length;i++){
            arr[i]= Integer.parseInt(str[i]);
        }
        for(int gap=n/2;gap>=1;gap/=2){
            for(int j=gap;j<n;j++){
                for(int i=j-gap;i>=0;i-=gap){
                    if(arr[i+gap]>arr[i]){
                        break;
                    }
                    else{
                        int temp=arr[i+gap];
                        arr[i+gap]=arr[i];
                        arr[i]= temp;
                    }
                }
            }
        }

        System.out.print(arr[0]);
        for(int i=1;i<n;i++){
            System.out.print(" "+ arr[i]);
        }
    }
}
