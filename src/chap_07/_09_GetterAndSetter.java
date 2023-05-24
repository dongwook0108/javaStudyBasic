package chap_07;

/**
 * @Title : Getter, Setter
 * @Content : Getter : 값을 가져오는 메소드, Setter : 값을 설정해주는 메소드
 */
public class _09_GetterAndSetter {

    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
//        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "black";

        // 할인행사
        b1.price = -5000;
        System.out.println(b1.price + "원");

        // 고객문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("-------------------");
        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("white");

        System.out.println(b2.getPrice() + " 원");
        System.out.println("해상도 : " + b2.getResolution());

    }

}
