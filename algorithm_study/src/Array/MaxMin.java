package Array;

import java.util.Scanner;

//백준10818
public class MaxMin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();;

        int[] array = new int[num];
        for(int i=0; i<array.length; i++){
            array[i] = input.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for(int i=1; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
