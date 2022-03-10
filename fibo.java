import java.util.Scanner;

public class fibo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n ,ter1,ter2,ter3,i;

        n = scanner.nextInt();
        ter1 = 0;
        ter2 = 1;
        System.out.printf("%d + %d",ter1,ter2);
        for(i = 3;i<=n;i++) {
            ter3 = ter1 + ter2;
            System.out.printf("%d",ter3);
            System.out.println();
            System.out.println();
            

            ter1 = ter2;
            ter2 = ter3;


        }


    }
}