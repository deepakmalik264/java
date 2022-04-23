package Array;

import java.util.Scanner;
public class ArrangeNumbers {

    public static void print(int []input){
        int size = input.length;

        for (int j : input) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void arrange(int[] arr, int n) {

        int left = 0;
        int right = n-1;
        int value = 1;
        while(left<=right){
            arr[left++] = value++;
            if(left<=right)  arr[right--] = value++;
        }


    }
    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        int testCase  = s.nextInt();
        while(testCase-->0){
            int n = s.nextInt();
            int []arr = new int[n];

            arrange(arr,n);
            print(arr);

        }
    }
}
