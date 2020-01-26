import java.util.Scanner;

public class task52 {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter lenght: ");
            int l = scanner.nextInt();
            int[] array = new int[l];
            int i = 0;
            while (i<l) {
                System.out.println("Enter " + (i+1) + " integer: ");
                array[i] = scanner.nextInt();
                i++;
            }



            int[] arrayPos = new int[l];
            int[] arrayNeg = new int[l];
            i = 0;
            while (i<l) {
                if(array[i]>0) {
                    arrayPos[i] = array[i];
                    arrayNeg[i] = 0;
                }
                else if(array[i]<0) {
                    arrayNeg[i] = array[i];
                    arrayPos[i] = 0;
                }
                i++;
            }


            for(int a=0;a<l;a++)
                System.out.print(array[a]+ " ");
            System.out.println(" ");
            for(int a=0;a<l;a++)
                System.out.print(arrayPos[a]+ " ");
            System.out.println(" ");
            for(int a=0;a<l;a++)
                System.out.print(arrayNeg[a]+ " ");




        }
    }

