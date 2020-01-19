import java. util. *;
public class task41 {
    public static String vlad(String str)
    {
        char arr[]=str. toCharArray();
        List<Character> list=new ArrayList<Character>();

        for(int i=0;i<arr.length;i++)

        {
            if(!list.contains(arr[i]))
            {
                list. add(arr[i]);
            }

        }
        return list.toString();
    }

    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        System. out. println("Введите слово: ");
        String str= sc. next();


        System. out. println(vlad(str));

    }

}

