package chap_06;

/**
 * 개인 정보 중 일부를 비공개로 전환하는 프로그램
 * 조건
 * 1. 개인정보를 비공개로 전환하는 메소드 작성
 * 2. 하나의 메소드에서 모든 동작 처리
 *
 */
public class _Quiz_06 {


    private static String getHiddenDate(String info, int cut) {

        String hiddenInfo = info.substring(0, cut);
        for (int i = 0; i < info.length() - cut; i++) {
            hiddenInfo += "*";
        }
        return hiddenInfo;
    }

    public static void main(String[] args) {
        String name = "김동욱";
        String id = "950108-1234567";
        String phone = "010-1234-1234";

        System.out.println("이름 : " + getHiddenDate(name, 1));
        System.out.println("주민번호 : " + getHiddenDate(id, 8));
        System.out.println("전화번호 : " + getHiddenDate(phone, 9));

    }

}
