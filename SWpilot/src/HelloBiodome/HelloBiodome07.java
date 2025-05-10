package HelloBiodome;

public class HelloBiodome07 {
    public static void main(String[] args) {
        String order = "";
        String answer = args[0];
        int i;
        for (i = 1; i < args.length; i++) {
            answer += args[i];
        }
        String gene = answer.toUpperCase();
        if (gene.matches("[CYJEH]*")) {
            int repeat = 1;
            order += gene.charAt(0);
            for (int j = 1; j < gene.length(); j++) {
                if (gene.charAt(j) == gene.charAt(j - 1)) {
                    repeat++;
                } else {
                    order += repeat;
                    repeat = 1;
                    order += gene.charAt(j);
                }
            }
            order += repeat;
            System.out.println(order);
        } else {
            System.out.println("염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요!");
        }
    }
}
