package TwoDimensionalArray;

import java.util.Scanner;

public class VerticalReading {
    public static void main(String[] args){
        char[][] array = new char[5][15];
        int[] lengths = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            lengths[i] = line.length();
            for (int j = 0; j < line.length(); j++) {
                array[i][j] = line.charAt(j);
            }
        }

        int maxLength = 0;
        for(int i=0; i<lengths.length; i++){
            int length = lengths[i];
            if(length > maxLength){
                maxLength = length;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int j = 0; j < maxLength; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < lengths[i]) { // 현재 열이 해당 행의 문자열 길이 내에 있으면
                    result.append(array[i][j]); // 해당 문자 추가
                }
            }
        }

        System.out.println(result.toString());
    }
}
