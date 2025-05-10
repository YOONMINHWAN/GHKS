package HelloBiodome;

public class HelloBiodome05 {
    public static void main(String[] args) {
        int[] answer = formula3();
        int g = answer[0];
        int h = answer[1];

        formula4(g, h);

        System.out.println();
    }
    public static boolean formula1(int g, int h) {
        return (g&1>>g<<2|h+g^h)==1;
    }
    public static boolean formula2(int g, int h) {
        return (g%2<<h>>g|1&0^0)==2;
    }
    public static int[] formula3() {
        for (int g=0; g<16; g++) {
            for (int h=0; h<16; h++) {
                if (formula1(g,h) && formula2(g,h)) {
                    return new int[]{g, h};
                }
            }
        }
        return new int[] {-1, -1};
    }
    public static void formula4(int g, int h) {
        System.out.println((h*h+g)*(h<<h)+(g<<g));
    }
}
