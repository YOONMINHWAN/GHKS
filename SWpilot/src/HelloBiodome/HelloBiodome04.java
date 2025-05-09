package HelloBiodome;

public class HelloBiodome04 {
    public static void main(String[] args) {
        double temperature, humidity, oxygen;
        try {
            temperature = Double.parseDouble(args[0]);
            humidity = Double.parseDouble(args[1]);
            oxygen = Double.parseDouble(args[2]);
            if (temperatureCheck(temperature)) {
                if (humidityCheck(humidity)) {
                    if (oxygenCheck(oxygen)) {
                        System.out.println("생명의 나무는 안정적인 상태입니다 :)");
                    } else {
                        System.out.println("산소농도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
                    }
                } else {
                    System.out.println("습도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
                }
            } else {
                System.out.println("온도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("입력된 값이 올바르지 않습니다. [온도][습도][산소농도] 순서대로 숫자 값을 입력해주세요!");
        }
    }
    public static boolean temperatureCheck(double temperature) {
        return 10 <= temperature && temperature < 27.5;
    }
    public static boolean humidityCheck(double humidity) {
        return 40 <= humidity && humidity < 60;
    }
    public static boolean oxygenCheck(double oxygen) {
        return 19.5 <= oxygen && oxygen < 23.5;
    }
}
