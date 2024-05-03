package If;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDices {
    public static void main(String[] main){
        Scanner input = new Scanner(System.in);
        int[] number = new int[3];
        for(int i=0; i<3; i++){
            number[i] = input.nextInt();
        }

        Arrays.sort(number);
        int max = number[2];

        if(number[0] == number[1] && number[1] == number[2]){
            System.out.println((10000 + max * 1000));
        }else if(number[0] == number[1] || number[1] == number[2] || number[0] == number[2]){
            if(number[0] == number[1]){
                System.out.println((1000 + number[0] * 100));
            }else if(number[0] == number[2]){
                System.out.println((1000 + number[0] * 100));
            }else{
                System.out.println((1000 + number[1] * 100));
            }
        }else{
            System.out.println((max * 100));
        }
    }

}
