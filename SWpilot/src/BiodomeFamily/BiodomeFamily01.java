package BiodomeFamily;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Organism {
    static String name = new String();
    String species = new String();
    String habitat = new String();
    public static void displayInfo() {

    }
}

class LifeNest {
    static List<String> organismlist = new ArrayList<>();

    public static void management() {
        for (int i = 0; i < organismlist.size(); i+=3) {
            System.out.println("[LifeNest]" + organismlist.get(i) + "이(가) 추가되었습니다.");
        }
    }
}

public class BiodomeFamily01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("동식물의 이름과 종, 서식지를 입력해 주십시오. [ex) 펭귄, 동물, 남극]");
            Organism.name = scanner.nextLine();
            for (int i = 0; i < scanner.nextLine().length(); i++) {
                Organism.name += scanner.nextLine().charAt(i);
            }
            if (Organism.name.equals("a")){
                break;
            }
            LifeNest.organismlist.add(Organism.name);
            LifeNest.management();
        }
    }
}
