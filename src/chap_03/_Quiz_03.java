package chap_03;

/**
 * 주민등록번호에서 생년월일 및 성별까지 출력하는 프로그램
 * 조건
 * 1. 주민번호는 13자리로 구성
 */
public class _Quiz_03 {

    public static void main(String[] args) {
        String idNumber = "950108-1002003";

        System.out.println(
                "생년월일 및 성별 출력 = " + idNumber.substring(0, 8));
        System.out.println(idNumber.substring(0, idNumber.indexOf("-") + 2));

    }
}
