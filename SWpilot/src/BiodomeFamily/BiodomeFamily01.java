package BiodomeFamily;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Organism {
    static String name = new String();
    static String species = new String();
    static String habitat = new String();
    public static void displayInfo() {

    }
}

class LifeNest {
    static List<LifeNest> organismlist = new ArrayList<>();

    public static void management() {
        organismlist.get(Integer.parseInt(Organism.name));
        System.out.println("[LifeNest]" + Organism.name + "이(가) 추가되었습니다.");
    }
}

public class BiodomeFamily01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Organism.name = scanner.nextLine();
        LifeNest.management();
    }
}
