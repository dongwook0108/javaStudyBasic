package chap_02;

/**
 * @Title : 연산자
 * @Content : 논리 연산자
 */
public class _04_Operator4 {

    public static void main(String[] args) {
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = false;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); //하나라도 true면 ture
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //모두 true 이면 true

        // and 연산
        System.out.println((5 > 2) && (3 > 1));
        System.out.println((5 > 2) && (3 < 1));

        // or 연산
        System.out.println((5 > 2) || (3 < 1));
        System.out.println((5 > 2) || (3 < 1));

        // 논리 부정 연산
        System.out.println(!true);
        System.out.println(!false);


    }

}
