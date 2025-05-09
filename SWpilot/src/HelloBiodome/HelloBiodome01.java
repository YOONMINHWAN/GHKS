package HelloBiodome;

public class HelloBiodome01 {
    public static void main(String[] args) {
        if(args.length > 0) {
            String name = args[0];
            System.out.println("환영합니다! " + name);
        }
        else {
            System.out.println("다시 입력해 주세요!");
        }
    }
}
