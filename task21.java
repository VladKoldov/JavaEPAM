import java.util.Scanner;

public class task21 {
    public static void main (String [] arg) {
        Scanner in = new Scanner(System.in) ;
        System.out.println( "Введите своё число : " );
        int number1 = in.nextInt() ;
        int dig1 = number1 % 10 ;
        int dig2 = number1 / 10 % 10 ;
        int dig3 = number1 / 100 % 10 ;
        int number2 = dig1 * 100 + dig2 * 10 + dig3 ;
        int result = number1 - number2 ;
        System.out.println(result);
    }
}

