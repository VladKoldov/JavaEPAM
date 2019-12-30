import java.util.Scanner;

public class task23 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите сумму вклада: ");
        int p = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        System.out.println(" Введите депозитную годовую ставку: ");
        int i = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println(" Введите срок вложения (в месяцах) : ");
        int t = in.nextInt();
        Scanner in3 = new Scanner(System.in);
        int result ;
        result = ( p * i * t ) / ( 12 * 100);
        System.out.println( "Полученый доход =   " +  result);

    }
}
