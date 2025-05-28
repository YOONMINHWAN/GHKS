package HelloBiodome;

public class HelloBiodome07 {
    public static void main(String[] args) {
        String order = "";
        //최종적으로 출력할 내용 변수
        String answer = args[0];
        //입력받은 값을 저장할 변수
        int i; //(for)반복문
        for (i = 1; i < args.length; i++) {
            answer += args[i];
            //입력받은 값을 answer 변수에 삽입
        }
        String gene = answer.toUpperCase();
        //받은 값을 대문자로 변환하여 gene 함수에 삽입
        if (gene.matches("[CYJEH]*")) {
            //C, Y, J, E, H 문자가 있을 시 아래 코드 실행
            int repeat = 1;
            //문자가 반복되는 횟수를 저장하는 변수
            order += gene.charAt(0);
            //(최종 출력 변수)에 시작 문자 추가
            for (int j = 1; j < gene.length(); j++) {
                //gene 변수의 문자 길이만큼 반복 (첫번째 문자는 앞에서 추가했으니 j가 1부터 시작)
                if (gene.charAt(j) == gene.charAt(j - 1)) {
                    //j번째 문자와 j-1번째 문자가 같으면 아래 코드 실행
                    repeat++;
                    //반복 횟수에 +1
                } else {
                    order += repeat;
                    //만약에 다르다면 반복 횟수를 order 변수(최종 출력)에 추가
                    repeat = 1;
                    //변수를 1로 초기화
                    order += gene.charAt(j);
                    //다음 문자를 order 변수(최종 출력)에 추가
                }
            }
            order += repeat;
            //반복이 끝났을 때 마지막 문자의 반복 횟수를 order 변수(최종 출력)에 추가
            System.out.println(order);
            //최종 출력
        } else { //C, Y, J, E, H 문자가 없을 시 아래 코드 실행
            System.out.println("염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요!");
        }
    }
}
