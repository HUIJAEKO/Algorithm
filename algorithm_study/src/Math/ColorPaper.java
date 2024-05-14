package Math;

import java.util.Scanner;

public class ColorPaper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[][] arr = new int[num][2];
        int area = 100*num;

        for(int i=0; i<num; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<num-1; i++) {
            int x1 = arr[i][0];
            int y1 = arr[i][1];
            int x2 = arr[i+1][0];
            int y2 = arr[i+1][1];
            int dupX, dupY;

            if(x1>=x2){
                if(y1>=y2){
                    dupX = x2+10-x1;
                    dupY = y2+10-y1;
                }else{
                    dupX = x2+10-x1;
                    dupY = y1+10-y2;
                }
            }else{
                if(y1>=y2){
                    dupX = x1+10-x2;
                    dupY = y2+10-y1;
                }else{
                    dupX = x1+10-x2;
                    dupY = y1+10-y2;
                }
            }

            area -= dupX * dupY;
        }
        System.out.println(area);
    }
}
