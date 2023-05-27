package chap_10;


/**
 * @Title : 익명 클래스2
 * @Content : 이름이 없는 클래스
 * // 수제버거로 예시
 */
public class _02_AnonymousClass2 {

    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("----------------");

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();

    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("동생이 만드는 군대리아 ~");
                System.out.println("재료는 : 딸기잼, 우유, 빵");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 엄마가 만드는 수제버거 ");
                System.out.println("재료는 : 빵, 소고기, 해시브라운, 양상추, 마요네즈");
            }
        };
    }
}

abstract class HomeMadeBurger {
    public abstract void cook();

}
