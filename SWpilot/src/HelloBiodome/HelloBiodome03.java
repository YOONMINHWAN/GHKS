package HelloBiodome;

public class HelloBiodome03 {
    public static void main(String[] args) {
        try {
        double temperature, humidity, oxygen;
        temperature = Double.parseDouble(args[0]);
        humidity = Double.parseDouble(args[1]);
        oxygen = Double.parseDouble(args[2]);

        System.out.println("온도 : " + temperature);
        System.out.println("습도 : " + humidity);
        System.out.println("산소 농도 : " + oxygen);
        System.out.println("생명지수 H = " + calculate(humidity, temperature, oxygen));
        }
        catch (NumberFormatException e) {
            System.out.println("유효하지 않은 값이 있습니다!");
        }
    }
    public static final double PI = 3.14;
    public static final double UB = 0.415;
    public static double root(double a) {
        double guess = a / 2;
        double epsilon = 0.0000000001;

        while (abs(guess*guess - a) > epsilon) {
            guess = (guess + a / guess) / 2;
        }
        return guess;
    }
    public static double abs(double a) {
        return a < 0 ? -a : a;
    }
    public static double calculate(double a, double f, double g) {
        double result = root(a) - f;
        return UB * abs(result) + g / (PI*PI);
    }
}