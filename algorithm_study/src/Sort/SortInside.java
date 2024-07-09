package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//백준1427
public class SortInside {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String N = input.next();
        String[] str = N.split("");
        Integer[] num = new Integer[str.length];

        for(int i=0; i<str.length; i++){
                num[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(num, Collections.reverseOrder());

        for(int k=0; k<str.length; k++){
            System.out.print(num[k]);
        }
    }
}