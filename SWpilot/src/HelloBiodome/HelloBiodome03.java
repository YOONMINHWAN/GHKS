package HelloBiodome;

public class HelloBiodome03 {
    public static void main(String[] args) {
        try {
        double temperature, humidity, oxygen;
        temperature = Double.parseDouble(args[0]);
        humidity = Double.parseDouble(args[1]);
        oxygen = Double.parseDouble(args[2]);

        System.out.println("생명지수 H = " + calculate(humidity, temperature, oxygen));
        }
        catch (NumberFormatException e) {
            System.out.println("유효하지 않은 값이 있습니다!");
        }
    }
    public static final double PI = 3.14;
    public static double root(double a) {
        double guess = a / 2;
        double epsilon = 0.0000000001;

        while (abs1(guess*guess - a) < epsilon) {
            guess = (guess + a / guess) / 2;
        }
        return guess;
    }
    public static double abs1(double a) {
        return a < 0 ? -a : a;
    }
    public static double calculate(double e, double f, double g) {
        double result = root(e) - f;
        return abs1(result) + g/PI;
    }
}