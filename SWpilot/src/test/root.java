package test;

public class root {
    public static double roots(double a) {
        double guess = a / 2;
        double epsilon = 0.0000000001;

        while (abs(guess*guess - a) < epsilon) {
            guess = (guess + a / guess) / 2;
        }
        return guess;
    }
    public static double abs(double a) {
        return a < 0 ? -a : a;
    }
}

