package Math;

import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int[] testNum = new int[num];
        for(int i=0; i<num; i++){
            testNum[i] = input.nextInt();
        }

        int total = num;

        for(int i=0; i<num; i++){
            int test = testNum[i];
            if(test == 1){
                total--;
            }else if(test == 2){
                continue;
            }
            for(int j=2; j<test-1; j++){
                if(test%j == 0) {
                    total--;
                    break;
                }
            }
        }
        System.out.println(total);
    }
}
