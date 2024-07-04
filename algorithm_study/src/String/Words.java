package String;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

//백준1157
public class Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next().toUpperCase();

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char maxChar = ' ';
        int maxCount = 0;
        boolean isUnique = true;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
                isUnique = true;
            } else if (entry.getValue() == maxCount) {
                isUnique = false;
            }
        }

        if (isUnique) {
            System.out.println(maxChar);
        } else {
            System.out.println("?");
        }
    }
}

// ******시간초과*******
//public class Words {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] string = input.next().toUpperCase().split("");
//        int[] repeat = new int[string.length];
//
//        int num = 0;
//        for(int i=0; i<string.length; i++){
//            for(int j=0; j<string.length; j++){
//                if(string[i].equals(string[j])){
//                    num++;
//                }
//            }
//            repeat[i] = num;
//            num = 0;
//        }
//
//        int max = 0;
//        String maxString = "";
//        for(int i=0; i<string.length; i++){
//            if(repeat[i]>max){
//                max = repeat[i];
//                maxString = string[i];
//            }
//        }
//
//        int maxNumber = 0;
//        for(int i=0; i<repeat.length; i++){
//            if(repeat[i] == max){
//                maxNumber++;
//            }
//        }
//
//        if(maxNumber>max){
//            System.out.println("?");
//        }else{
//            System.out.print(maxString);
//        }
//    }
//}
