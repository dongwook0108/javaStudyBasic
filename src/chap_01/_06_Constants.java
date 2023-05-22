package chap_01;

/**
 * @Title : 상수
 * @Content : 변수와 다르게 값 변경이 안됨
 */
public class _06_Constants {

    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82"; //국가번호
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592; // 원주율
        System.out.println(PI);

        final String DATE_OF_BIRTH = "1995-01-08";
        System.out.println(DATE_OF_BIRTH);
    }

}
