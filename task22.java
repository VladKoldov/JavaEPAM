import java.util.Scanner;

public class task22 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите количество в фунтах: ");
        int num = in.nextInt();
        double res ;
        res = (num * 0.4536);
        int res1 = (int)res;
        double res2 = res - res1;
        res2 = res2 * 1000;
        System.out.println( res1 + " Килограмм(а)  " + res2 + " грамм(а)" );
    }
}
