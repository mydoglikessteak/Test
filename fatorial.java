import java.util.Scanner;

class fatorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 1;
        System.out.println();
        for (int i = 1; i <= N; i++){
            c *= i;
             System.out.println(c);

        }
        sc.close();



       

        
    }
}