public class mathod {
    public static void main(String[] args) {
        double result = calculateRoot(30.0);  // 메서드 호출
        System.out.println("루트 값: " + result);
    }
    public static double calculateRoot(double x) {
        return Math.sqrt(x);
    }
}
