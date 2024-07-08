package Sort;

import java.util.Scanner;

//백준2750
public class SortNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] num = new int[N];
        for(int i=0; i<N; i++){
            num[i] = input.nextInt();
        }

        for(int i=0; i<N; i++){
            for(int j=N-1; j>i; j--){
                if(num[j-1] > num[j]){
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(num[i]);
        }
    }
}
