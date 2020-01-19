import java. util. *;
public class task42 {
    public static String intToBinary(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }
        return s;
    }



    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        System. out. println("Введите десятичное число: ");
        int str = sc. nextInt();


        System. out. println(intToBinary(str));

    }

}
