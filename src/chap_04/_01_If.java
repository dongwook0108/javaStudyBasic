package chap_04;

/**
 * @Title : 조건문
 * @Content : if
 */
public class _01_If {

    public static void main(String[] args) {
        // 조건문 If
        int hour = 15;

        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }

        System.out.println("커피 주문 완료");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우만 커피를 주문
        hour = 10;
        boolean morningCoffee = false;

        if (hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 +1");
        }

        System.out.println("커피 주문 완료");

        // 오후 2시 이후이거나 커피를 마신경우?
        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee) {
            System.out.println("디카페인주문");
        }

        System.out.println("커피 주문 완료");

    }
}
