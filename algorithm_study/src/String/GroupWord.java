package String;

import java.util.Scanner;

//백준1316
public class GroupWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int group = num;

        for (int i = 0; i < num; i++) {
            boolean[] bool = new boolean[26];
            String string = input.next();
            int pre = 0;

            for(int j=0; j<string.length(); j++){
                int now = string.charAt(j);

                if(pre != now){
                    if(!bool[now - 'a']){
                        bool[now - 'a'] = true;
                        pre = now;
                    }else{
                        group--;
                        break;
                    }
                }
            }
        }
        System.out.println(group);
    }
}
