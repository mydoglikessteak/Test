import java.util.Scanner;

public class invertido{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,inv,dig,q;
        num = sc.nextInt();
        System.out.println();
        inv = 0;
        q = num ;

        while(q>0){
            dig = q %10;
            inv = inv * 10 + dig;
            q = q/10;
        }
        System.out.printf("%d Numero Original",num);
        System.out.println();
        System.out.printf("%d NUmero invertido",inv);

        
        sc.close();
    }
}