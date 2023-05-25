package chap_07;

/**
 * 햄버거를 자동으로 만드는 프로그램
 * 조건
 * 1. 치즈버거, 새우버거, 햄버거 => 3종류
 * 2. 각 버거는 각각의 클래스로 생성
 *
 *
 */
public class _Quiz_07 {

    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("===========");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("----------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");

    }


}

class HamBurger {
    public String name;

    public HamBurger() {
        this("햄버거");
    }

    public HamBurger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }

}

class CheeseBurger extends HamBurger {

    public CheeseBurger() {
//        super("치즈버거");
        this.name = "치즈버거'";
    }
    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");

    }
}

class ShrimpBurger extends  HamBurger{
    public ShrimpBurger() {
//        super("새우버거");
        this.name = "새우버거";
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}





