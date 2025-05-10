package HelloBiodome;

public class HelloBiodome06 {
    public static void main(String[] args) {
        String gene1 = args[0];
        String gene2 = args[1];
        if (gene1.length() > gene2.length()) {
            gene1 = args[1];
            gene2 = args[0];
        }
        if (gene1.length() < 5 || gene1.length() > 20 || gene2.length() < 5 || gene2.length() > 20) {
            System.out.println("유전자 정보가 잘못되었습니다. 두 개의 유전자 코드를 입력해주세요.");
        }
        else {
            int check = 0;
            int i = 0;
            int j = 0;
            while (i < gene1.length() && j < gene2.length()) {
                if (gene1.charAt(i) == gene2.charAt(j)) {
                    i++;
                    j++;
                    check++;
                }
                else {
                    j++;
                    if (check != 0) {
                        check--;
                    }
                }
            }
            if (check == gene1.length()) {
                System.out.println("동일한 유전자 코드입니다.");
                if (gene1.length() != gene2.length()) {
                    System.out.println("부분적으로 포함됩니다.");
                }
            }
            else {
                System.out.println("일치하지 않습니다.");
            }
        }
    }
}

