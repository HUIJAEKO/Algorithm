package Sort;

import java.util.Arrays;
import java.util.Scanner;

//백준25305
public class CutLine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int k = input.nextInt();
        int[] num = new int[N];
        for(int i=0; i<N; i++){
            num[i] = input.nextInt();
        }

        Arrays.sort(num);
        System.out.println(num[N-k]);
    }
}
