package recursion;
import java.util.Scanner;
public class sortedArray {

    public static boolean checkIfArrayIsSortedOrNot(int []arr){

        return checkIfArrayIsSortedOrNot_helper(arr,arr.length-1);
    }

    // 1 2 3 4 5

    private static boolean checkIfArrayIsSortedOrNot_helper(int []arr ,int size){
        if(size==0) return true;
        if(arr[size]<arr[size-1]) return false;
        return checkIfArrayIsSortedOrNot_helper(arr,size-1);
    }

    public static void main(String []args){

        Scanner s = new Scanner(System.in);

        int size = s.nextInt();

        int []arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }

        boolean result = checkIfArrayIsSortedOrNot(arr);

        if(result){
            System.out.println("Array is sorted");
        }
        else System.out.println("Array is not sorted");



    }

}
