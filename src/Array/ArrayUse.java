package Array;
import java.util.Scanner;
public class ArrayUse {

     public static void main(String []args){

         Scanner s = new Scanner(System.in);

         // in c++
         // int arr[10] or int * arr = new int[100];

         // in java

         int[] arr = new int[10];

         for(int i=0;i<10;i++){
             int data = s.nextInt();
             arr[i]= data; /// or arr[i] = s.nextInt();
         }

         for(int i=0;i<10;i++){
             System.out.println(arr[i]);
         }

         int k=100000;
         Boolean[] prime = new Boolean[k];

         char[] name  = new char[100];

         /*

           How are array stored in memory?

           DataType in Java
           1: primitive DateType and Non-Primitive DataType
               int                   array
               char                  String , Scanner
               double
               boolean


           2:  int arr[]  = new int[]
           3:  System.out.println(arr) = [I@______] address
           4:













          */







     }
}
