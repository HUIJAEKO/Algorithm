package Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//백준11650
public class Coordinate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] num = new int[N][2];

        for(int i=0; i<N; i++){
            num[i][0] = input.nextInt();
            num[i][1] = input.nextInt();
        }

        Arrays.sort(num, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[0] == o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return o1[0]-o2[0];
                }
            }
        });
        for(int i=0; i<N; i++){
            System.out.println(num[i][0] + " " + num[i][1]);
        }
    }
}
