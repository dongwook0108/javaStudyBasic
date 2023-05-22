package chap_04;

/**
 * @Title : 조건문
 * @Content : If Else
 */
public class _02_Else {

    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 10;

        if (hour < 14) { // 오후 2시 이전이면
            System.out.println("아메리카노 +1");

        } else { // 그 외의 경우
            System.out.println("디카페인 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // 오후 2시 이후이거나 모닝커피를 마신경우
        hour = 10;
        boolean morningCoffee = false;

        if (hour >= 14 || morningCoffee) {
            System.out.println("디카페인 +1");
        } else {
            System.out.println("아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");



    }
}
