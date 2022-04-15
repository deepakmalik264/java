package functions;
import java.util.Scanner;
public class NcR {

    public static void main(String []args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        int result = nCr(n,r);
        System.out.println(result);

    }

     public static int nCr(int n,int r){
             /*
              ncr = n!/(n-r)!*r!

              */

         return  factorial(n)/(factorial(n-r)*factorial(r));
     }

     public static int factorial(int k){
         int res =1;
         for(int i=1;i<=k;i++){
             res*=i;
         }
         return res;
     }


}
