package Sort;

import java.util.Arrays;
import java.util.Scanner;

//백준2587
public class SortAndAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0; i<5; i++){
            num[i] = input.nextInt();
        }

        Arrays.sort(num);

        int sum = 0;
        int average;

        for(int i=0; i<5; i++){
            sum+=num[i];
        }
        average = sum/5;

        System.out.println(average);
        System.out.println(num[2]);
    }
}
