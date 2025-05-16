package RoadToBiodome;


import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Collections;


public class RoadToBiodome02 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("입력된 메시지가 올바르지 않습니다. 다시 한 번 확인해주세요!");
            return;
        }
        try {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < args.length; i++) {
                String arg = args[i];
                String result1 = "";
                for (int j = 0; j < arg.length(); j++) {
                    result1 += arg.charAt(arg.length() - 1 - j);
                }
                list.add(result1);
            }
            Collections.reverse(list);
            String result2 = "";
            for (int i = 0; i < list.size(); i++) {
                result2 += list.get(i) + " ";
            }
            System.out.println(result2);
        } catch (Exception e) {
            System.out.println("입력된 메시지가 올바르지 않습니다. 다시 한 번 확인해주세요!");
            return;
        }



    }
}
