package FileInputStream;

import jdk.dynalink.beans.StaticClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BiodomeForever01 {
    public static void main(String[] args) {
        labJournalManagement.main(args);
    }
}

class labJournal {
    public static void main(String[] args) {
        String fileName = null;
        String fileContents = null;
        try {
            FileInputStream files = new FileInputStream(labJournalManagement.fileName);
            while
        }
        catch (IOException e) {
        }
    }
}
//연구일지 '파일 이름' / '내용' 속성 가진다
//연구일지의 내용 출력한다
class labJournalManagement {
    static String fileName = "";
    public static void main(String[] args) {
        boolean success = false;
        while (!success) {
            try {
                System.out.println("파일 이름을 입력해주십시오. (확장자명 포함)");
                Scanner inputFileName = new Scanner(System.in);
                fileName = inputFileName.nextLine();
                if (fileName.trim().isEmpty()) {
                    throw new Exception("잘못된 파일 이름입니다.");
                }
                System.out.println(fileName);
                success = true;
                //성공하면 루프 종료
            } catch (Exception e) {
                System.out.println("잘못된 파일 이름입니다.");
            }
        }
        labJournalManagement.main(args);
    }
}
//연구일지 파일 이름을 입력받아(확장자명과 함께 받는다) 파일에 접근
//안정성 중요
//try-finally 이용하여 파일을 읽고 안전하게 닫기
//문제 발생 시 사용자에게 안내