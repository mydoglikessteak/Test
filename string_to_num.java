import java.util.Scanner;

public class string_to_num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String seq = sc.nextLine();
        char carac;
        char cod;
        int num = 0;
        int n = seq.length();
        for (int i = 0; i < n; i++){
            carac = seq.charAt(i);
            cod = seq.charCodeAt();
            
        }

       

        sc.close();
    }
}