package chap_04;

/**
 * @Title : 조건문
 * @Content : Switch Case
 */
public class _03_SwitchCase {

    public static void main(String[] args) {
        //Switch Case
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 10프로 장학금
        // 그 외 : 장학금 대상이 아님

        int ranking = 1; //등수

        //IF Else 문을 이용 -> 여러 조건 또는 범위에 해당하는 조건
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2) {
            System.out.println("반액 장학금");
        } else if (ranking == 3) {
            System.out.println("10프로 장학금");
        } else {
            System.out.println("장학금 대상이 아닙니다.");
        }
        System.out.println("조회 완료 #1");

        //Switch Case 이용 -> 명확한 case가 있는 경우
        ranking = 1;
        switch (ranking) {
            case (1):
                System.out.println("전액 장학금");
                break;
            case (2):
                System.out.println("반액 장학금");
                break;
            case (3):
                System.out.println("10프로 장학금");
                break;
            default:
                System.out.println("장학금 대상이 아닙니다.");
        }
        System.out.println("조회 완료 #2");

        // 중고상품의 등급에 따른 가격을 책정
        int grade = 3;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격은 : " + price + "원");

    }


}
