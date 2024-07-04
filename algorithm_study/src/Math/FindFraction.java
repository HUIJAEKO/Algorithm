package Math;

import java.util.Scanner;

//백준1193
public class FindFraction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        int n = 0;

        while(sum<num){
            n++;
            sum += n;
        }

        int position = num - (sum - n);
        int numerator, denominator;

        if (n % 2 == 0) {
            numerator = position;
            denominator = (n + 1) - position;
        } else {
            numerator = (n + 1) - position;
            denominator = position;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
