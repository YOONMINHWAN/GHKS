package test;

public class root {
    public static double sqrt(double n) {
        if (n < 0) throw new IllegalArgumentException("음수는 불가");

        double guess = n / 2.0;
        double epsilon = 1e-10;

        while (abs(guess * guess - n) > epsilon) {
            guess = (guess + n / guess) / 2.0;
        }

        return guess;
    }

    private static double abs(double value) {
        return (value < 0) ? -value : value;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(3));    // 대략 1.414
    }
}

