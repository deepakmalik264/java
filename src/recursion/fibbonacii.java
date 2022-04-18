package recursion;

import java.util.Scanner;




public class fibbonacii {

    public static int fibbonacii(int n){

        if(n==0 || n==1) return n;

        return fibbonacii(n-1) + fibbonacii(n-2);
    }


    public static void main(String []args){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        System.out.println(fibbonacii(n));

    }
}
