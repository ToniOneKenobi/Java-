import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        int[] array1 = readIntegers(5);
        findMin(array1);

    }
    public static Scanner scanner = new Scanner(System.in);
    public static int[] readIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter #" + i + " number ");
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));


        return array;
    }

    public static void findMin(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                   temp = array[i];
                   array[i]=array[j];
                   array[j]=temp;


                }
            }

        }
        System.out.println(array[0]);

    }
}


