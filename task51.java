import java.util.Arrays;
import java.util.Scanner;

public class task51 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i<10) {
            System.out.println("Enter " + (i+1) + " integer: ");
            array[i] = scanner.nextInt();
            i++;
        }
        i = 0;
        int[] array2 = new int[10];
            while (i<10) {
            System.out.println("Enter " + (i+1) + " integer: ");
            array2[i] = scanner.nextInt();
            i++;
        }
        int[] array3 = new int[10];
            i = 0;
        while (i<10) {
            array3[i] = array[i]+array2[i];
            i++;
        }


        for(int a=0;a<10;a++)

            System.out.print(array2[a]+ " ");
        System.out.println(" ");
        for(int a=0;a<10;a++)

            System.out.print(array3[a]+ " ");
        System.out.println(" ");
        for(int a=0;a<10;a++)

            System.out.print(array[a]+ " ");




    }
}
