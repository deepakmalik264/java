package functions;

public class Increment {

    public static void increment(int n){
        n = n+1;
    }


     public static void main(String []args){

        int a = 10;
        increment(a);
        System.out.println(a); // only 10 will be print because be pass by value;
         // it will be created a new storage function n in increment
         // so anything happen is happening to new copy value
         // pass by reference doesn't exist in java



     }
}
