package HelloBiodome;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String answer = args[0];
        int i;
        for (i = 1; i < args.length; i++) {
            answer += args[i];
        }
        System.out.println(answer);
    }
}
