package soma;

import java.util.Scanner;

public class somatorio{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int  n,num,sum,i;
        n =  sc.nextInt();
        sum = 0;
        i = 0;
        while(i<n){

            num = sc.nextInt();
            
            if(num >= 50){
                i +=1;

            }


            sum += num;

            i += 1 ;

        }
        sc.close();
        System.out.printf("A soma dos %d numeros é %d ",n,sum);

    }
}