package Array;
import java.util.Scanner;
public class ArrayToFunction {
    public static void change(int input[]){
        input = new int[5];
        input[0] = 15;
    }
    public static void  printLargestElement(int []arr){


        int maxElement = Integer.MIN_VALUE;
        int size = arr.length;
        for(int i=0;i<size;i++){
            maxElement = Math.max(maxElement,arr[i]);
        }
        System.out.println("Largest Element is " + maxElement);
    }
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int []input = new int[size];
        for(int i=0;i<size;i++){
            input[i]  = s.nextInt();
        }
        return input;
    }

    public static void print(int []input){
        int size = input.length;
        input[2] = 100;
        for(int i=0;i<size;i++){
            System.out.print(input[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String []args){

        int a[] = new int[5];
        change(a);
        System.out.println(a[0]);
        int []arr = takeInput();
        print(arr);

        printLargestElement(arr);





    }
}
