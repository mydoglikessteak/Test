import java.util.Scanner;

public class conversao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        double q = n;
        int[] r = new int[100];
        int i = 0;


        while (q > 0) {
            r[i] = (int) (q % 2);
            i++;
            q = Math.floor(q / 2);
        }

        System.out.println("Número " + n + " na base binária: ");
        while (i > 0)
        {
            i--;
            System.out.println(r[i]);
        }

    }
}