import java. util. *;
public class task411 {
    public static String VLAD (String str)
    {
        String substring = str.length() > 2 ? str.substring(str.length() - 2) : str;
      return   new StringBuilder(substring).reverse().toString();

    }



    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        System. out. println("Введите  число: ");
        String str = sc. next();


        System. out. println(VLAD(str));

    }

}
