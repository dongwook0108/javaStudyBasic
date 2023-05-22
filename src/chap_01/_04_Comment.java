package chap_01;

/**
 * @Title : 주석
 * @Content : 프로그램 실행되지 않음, 부가설명을 해줌
 */
public class _04_Comment {

    public static void main(String[] args) {
        System.out.println("(10분전) 결혼식 시작 예정이니 착석 부탁드립니다.");
//        System.out.println("(5분전) 결혼식 시작 예정이니 착석 부탁드립니다.");
        System.out.println("결혼식 시작합니다.");

        int size = 120;
        size = size + 10; //어린이는 발이 빨리 자라기 때문에 사이즈 10만큼 더 크게 주문
        System.out.println("신발 사이즈 " + size + "으로 주세요");


        /*int a = 10;
        int b = 20;
        System.out.println(a + b); // 30
        */

        // 여러줄 주석 : command + shift + /
    }

}
