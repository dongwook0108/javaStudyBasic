package chap_10;


/**
 * @Title : 익명 클래스
 * @Content : 이름이 없는 클래스
 * 1. 똑같은 클래스를 이용하는데 기능을 확장해서 사용
 * 2. 1회성 코드
 */
public class _01_AnonymousClass1 {

    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        c1.returnTray();

        System.out.println("----------------");
        Coffee c2 = new Coffee();
        c2.order("라떼");
        c2.returnTray();

        System.out.println("----------------");
        // 지인이 방문
        Coffee specialCoffee = new Coffee(){
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("케이크는 서비스");
            }

            @Override
            public void returnTray() {
                System.out.println("자리에 두면 내가 치울게 ~~");
            }
        };
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
    }

}

class Coffee {

    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왓습니다.");
    }

    public void returnTray() {
        System.out.println("커피 반납 완료 !");
    }

}
