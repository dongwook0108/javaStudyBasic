package chap_04;

/**
 * @Title : 조건문
 * @Content : ElseIf
 */
public class _03_ElseIf {

    public static void main(String[] args) {
        // 조건문 Else if
        // 한라봉 에이드 있으면 +1
        // 또는 망고 에이드 있으면 +1
        // 아이스 아메리카노 +1

        boolean halloabongAde = false;
        boolean mangoJuice = false;

        if (halloabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");
    }
}
