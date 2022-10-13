import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        fizzbuzz(20);
    }

    public  static void fizzbuzz(int a) {

        for (int i = 1; i < a; i++) {

           if (i%3==0){
               System.out.print("Fizz");
           }
           if (i%5==0){
               System.out.print("Buzz");
           }
           if (i%3!=0&&i%5!=0){
               System.out.print(i);
           }
           System.out.print(","+" ");

        }


    }
}
