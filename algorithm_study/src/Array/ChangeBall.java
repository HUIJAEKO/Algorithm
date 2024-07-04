package Array;

import java.util.Scanner;

//백준10831
public class ChangeBall {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int change = input.nextInt();

        int[] array = new int[num];
        for(int i=0; i<num; i++){
            array[i] = i+1;
        }

        for(int i=0; i<change; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int temp = array[a-1];
            array[a-1] = array[b-1];
            array[b-1] = temp;
        }

        for(int i=0; i<num; i++){
            System.out.print(array[i] + " ");
        }

    }
}
