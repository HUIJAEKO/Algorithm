package BruteForce;

import java.util.Scanner;

//백준2839
public class Sugar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int box = -1;

        for(int i=0; i<=N/5; i++){
            int reminder = N - 5 * i;
            if(reminder % 3 == 0){
                int j = reminder / 3;
                box = i + j;
            }
        }
        System.out.println(box);
    }
}
