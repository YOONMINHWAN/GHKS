public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("문자열을 입력해주세요!");
        String input = scanner.nextLine();
        System.out.println("환영합니다! " + input + "님");
    }
}
