package String;

import java.util.Scanner;

//백준11720
public class SumOfNumbers {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numbersOfNumbers = input.nextInt();

        String numbers = input.next();

        String[] numberArray = new String[numbersOfNumbers];
        numberArray = numbers.split("");

        int[] number = new int[numbersOfNumbers];

        for(int i = 0; i<numbersOfNumbers; i++){
            number[i] = Integer.parseInt(numberArray[i]);
        }

        int sum = 0;
        for(int i = 0; i<numbersOfNumbers; i++){
            sum += number[i];
        }

        System.out.println(sum);
    }
}
