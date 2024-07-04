package Math;

import java.util.Scanner;

//백준11653
public class PrimeFactorization {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        while(num != 1){
            for(int i=2; i<=num; i++){
                if(num%i == 0){
                    System.out.println(i);
                    num /= i;
                    break;
                }
            }
        }
    }
}
