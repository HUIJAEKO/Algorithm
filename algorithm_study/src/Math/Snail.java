package Math;

import java.util.Scanner;

//백준2869
public class Snail {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long up = input.nextLong();
        long down = input.nextLong();
        long height = input.nextLong();

        if (up >= height) {
            System.out.println(1);
            return;
        }

        long move = up - down;
        long days = (height - down - 1) / move;

        System.out.println(days+1);
    }
}
