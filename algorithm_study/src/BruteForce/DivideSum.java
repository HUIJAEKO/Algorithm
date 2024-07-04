package BruteForce;

import java.util.Scanner;

//백준2231
public class DivideSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int result = 0;

        for(int i=1; i<N; i++){
            int sum = i;
            int number = i;

            while(number != 0){
                sum += number % 10;
                number /= 10;
            }

            if(sum == N){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
