/* Algoritmo Fundamental Nº 1
   Descrição : Troca dos valores de duas variáveis.
   Problema  : Dadas duas variáveis, trocar os valores atribuídos a elas.
   Aplicações: Algoritmos de ordenação.
*/
import java.util.Scanner;

public class troca {
  public static void main(String[] args) {
    int a, b, aux;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe valor para a variável A:");
    a = sc.nextInt();
    System.out.println("Informe valor para a variável B:");
    b = sc.nextInt();

    aux = a;
    a = b;
    b = aux;

    System.out.println("Valor A: " + a);        
    System.out.println("Valor B: " + b);        
  }
}