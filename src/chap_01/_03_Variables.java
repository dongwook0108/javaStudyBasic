package chap_01;

/**
 * @Title : 변수
 * @Content : 어떤 값을 저장하는 공간
 */
public class _03_Variables {

    public static void main(String[] args) {
        String name;  //문자열 변수
        name = "김동욱";

        int hour;     // 정수형 변수
        hour = 11;

        System.out.println(name +"님, 배송이 시작됩니다. " + hour+ "시에 방문 예정입니다.");
        System.out.println(name +"님, 배송이 완료되었습니다.");

        double score = 90.5; //실수 자료형
        char grade = 'A';
        name = "강백호";   //변수값 바꿈
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다. ");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true; //boolean 자료형
        System.out.println("이번 시험에 통과했나요? " + pass);

        // double vs float
        // double은 그냥 사용, float은 숫자 뒤에 f or F 사용
        // double 정밀한 값까지 출력
        double d = 3.14987654321;
        float f = 3.14987654321F;
        System.out.println(d);
        System.out.println(f);

        //int vs long
        // int범위 약 +21억 ~ -21억
        // 21억 초과시 long 형 사용

//        int i = 1000000000000;
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }

}
