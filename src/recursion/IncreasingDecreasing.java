package recursion;

import java.util.Scanner;

public class IncreasingDecreasing {

    public static void increasing(int n){
        if(n==0) {
            System.out.print(n+ " ");
            return;
        }

        increasing(n-1);
        System.out.print(n+ " ");


    }
    public static void decreasing(int n){
        if(n==0) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        decreasing(n-1);
    }


    public static void main(String []args){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        increasing(n);
        System.out.println();
        decreasing(n);;

    }
}
