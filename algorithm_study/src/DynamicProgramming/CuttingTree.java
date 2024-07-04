package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

//백준13263
public class CuttingTree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int numberOfTrees = input.nextInt();
        int[] heightOfTrees = new int[numberOfTrees];
        int[] chargeCost = new int[numberOfTrees];
        int result;

        for(int i=0; i<numberOfTrees; i++){
            heightOfTrees[i] = input.nextInt();
        }

        for(int i=0; i<numberOfTrees; i++){
            chargeCost[i] = input.nextInt();
        }

        result = minFunction(heightOfTrees, chargeCost);
        System.out.println(result);
    }

    public static int minFunction(int[] a, int[] b){
        int index = a.length;
        int min = b[0] + ((a[1]-1) * b[0]) + (b[1]*a[index-1]);

        for(int i=2; i<index; i++){
            if(b[0] + ((a[i]-1) * b[0]) + (b[i]*a[index-1]) < min){
                min = b[0] + ((a[i]-1) * b[0]) + (b[i]*a[index-1]);
            }
        }
        return min;
    }

//    public static int minCost(int[] heights, int[] costs) {
//        int n = heights.length;
//        int[] dp = new int[n];
//        Arrays.fill(dp, int.MAX_VALUE);
//        dp[0] = 0;
//
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                int cost = (j > 0 ? dp[j - 1] : 0) + heights[i] * costs[j];
//                dp[i] = Math.min(dp[i], cost);
//            }
//        }
//
//        return dp[n - 1];
//    }
}
