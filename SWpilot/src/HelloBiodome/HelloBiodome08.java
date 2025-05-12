package HelloBiodome;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HelloBiodome08 {
    public static void main(String[] args) {
        String[] words = {"hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem", "please", "need", "we", "isn’t", "there", "a", "your", "any", "thanks", "the", "for", "solution", "can", "?"};

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해주십시오!");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int locate = 0;
        for (int i = 0; i < words.length; i++) {
            if (input.startsWith(words[i], locate)) {
                result.append(words[i]).append(" ");
                locate += words[i].length();
            } else {
                System.out.println("틀림");
            }
        }
        System.out.println(result);
        System.out.println(words[1]);
    }
}
