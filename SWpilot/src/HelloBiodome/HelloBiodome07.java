package HelloBiodome;

public class HelloBiodome07 {
    public static void main(String[] args) {
        String order = "";
        String call = args[0];
        String gene = call.toUpperCase();
        if (gene.matches("[CYJEH]*")) {
            int repeat = 1;
            order += gene.charAt(0);
            for (int i = 1; i < gene.length(); i++) {
                if (gene.charAt(i) == gene.charAt(i - 1)) {
                    repeat++;
                } else {
                    order += repeat;
                    repeat = 1;
                    order += gene.charAt(i);
                }
            }
            order += repeat;
            System.out.println(order);
        } else {
            System.out.println("염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요!");
        }
    }
}
