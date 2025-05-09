package HelloBiodome;

public class HelloBiodome02 {
    public static void main(String[] args) {
        int solarEnergy = Integer.parseInt(args[0]);
        int windEnergy = Integer.parseInt(args[1]);
        int geothermalEnergy = Integer.parseInt(args[2]);

        if (solarEnergy < 0 || solarEnergy > 30000 || windEnergy < 0 || windEnergy > 30000 || geothermalEnergy < 0 || geothermalEnergy > 30000) {
            System.out.println("다시 입력해주세요!");

        }
        else {
            System.out.println("태양광 에너지 : " + solarEnergy);
            System.out.println("풍력 에너지 : " + windEnergy);
            System.out.println("지열 에너지 : " + geothermalEnergy);
            System.out.println("총 에너지 사용량은 " + (solarEnergy + windEnergy + geothermalEnergy) + "입니다.");
        }
    }
}
