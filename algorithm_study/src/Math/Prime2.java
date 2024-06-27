package Math;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();

        int total = 0;
        int min = n;

        for(int i = m; i <= n; i++){
            boolean isPrime = true;

            if (i == 1) {
                isPrime = false;
            } else {
                for(int j = 2; j <= i-1; j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }

            if(isPrime){
                total += i;
                if(i < min){
                    min = i;
                }
            }
        }

        if(total == 0){
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(min);
        }

    }
}
