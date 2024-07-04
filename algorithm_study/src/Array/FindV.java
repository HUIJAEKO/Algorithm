package Array;

import java.util.Scanner;

//백준10807
public class FindV {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] array = new int[N];
        for(int i=0; i<array.length; i++){
            array[i] = input.nextInt();
        }

        int v = input.nextInt();
        int numOfV = 0;

        for(int i=0; i< array.length; i++){
            if(array[i] == v){
                numOfV++;
            }
        }

        System.out.println(numOfV);
    }
}
