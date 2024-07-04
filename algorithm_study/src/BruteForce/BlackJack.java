package BruteForce;

import java.util.Scanner;

//백준2798
public class BlackJack {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int sum = 0;

        int[] num = new int[N];
        for(int i=0; i<N; i++){
            num[i] = input.nextInt();
        }

        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    int result = num[i] + num[j] + num[k];
                    if(result <= M && result > sum){
                        sum = result;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
