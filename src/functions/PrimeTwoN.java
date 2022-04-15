package functions;
import java.util.Scanner;
public class PrimeTwoN {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

         int N = s.nextInt();
         printPrimeUptoN(N);
    }

    public static void printPrimeUptoN(int N){

        // time Complexity N*root(N);

        for(int i=0;i<=N;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n){

        if(n==1 || n==0) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;

    }

}
