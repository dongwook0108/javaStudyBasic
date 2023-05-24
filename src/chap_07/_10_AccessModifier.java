package chap_07;

/**
 * @Title : 접근제어자
 * @Content : 접근을 제어하는 것
 * private: 해당 클래스 내에서만 접근 가능
 * public: 모든 클래스에서 접근 가능
 * default : (아무것도 적지 않았을 때)같은 패키지 내에서만 접근 가능
 * protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능
 */
public class _10_AccessModifier {

    public static void main(String[] args) {
        BlackBoxRefubish b1 = new BlackBoxRefubish();
        b1.modelName = "까망이";
//        b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "black";

        // 할인행사
        b1.setPrice(-5000);
        System.out.println(b1.getPrice() + "원");

        // 고객문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("-------------------");
        BlackBoxRefubish b2 = new BlackBoxRefubish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("white");

        System.out.println(b2.getPrice() + " 원");
        System.out.println("해상도 : " + b2.getResolution());


    }

}
