package chap_03;

/**
 * @Title : 특수 문자(EscapeSequence)
 * @Content : \n, \t, \\, \", \'
 */
public class _04_EscapeSequence {

    public static void main(String[] args) {
        //특수문자(escape sequence, escape character, special character)

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌습니다.");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌습니다.");

        // \t : 탭 효과
        // 해물파전 10000원
        // 김치전  8000원
        // 부추전  7500원
        System.out.println("해물파전 8000원");
        System.out.println("김치전\t9000원");
        System.out.println("부추전\t7500원");

        // \\ -> \ 하나로 나옴
        System.out.println("C:\\Program Files\\Java");

        // \" : 큰따옴표
        // 고양이가 "냐옹" 했어요
        System.out.println("고양이가 \"냐옹\" 했어요");

        // \' : 작은 따옴표
        // 고양이가 '냐옹' 했어요
        System.out.println("고양이가 \'냐옹\' 했어요");
        System.out.println("고양이가 '냐옹' 했어요");

        char c = 'A';
        c = '\'';
        System.out.println(c); // ' 하나만 출력









    }

}
