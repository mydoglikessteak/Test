import java.util.*;
import java.math.*;

class Main {
  public static long fatorial(long n) {
      long fat = 1;
      for(long i = n; i >= 1; i--) {
         fat = fat * i;
      }    
      return fat;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o valor de x:");
    int x = sc.nextInt();
    System.out.println("Informe o número de termos da série:");
    int n = sc.nextInt();

    double termo;
    int sinal = 1;
    int j = 1;
    double seno = 0;
    //System.out.println(fatorial(5));

    for (int i = 1; i <= n; i++) {
       termo = Math.pow(x, j) / fatorial(j);
       seno = seno + sinal * termo;
	     sinal = -1 * sinal;
	     j = j + 2;
       //System.out.println(termo);   
    }
    System.out.printf("Valor: %.2f", seno);
  }
}