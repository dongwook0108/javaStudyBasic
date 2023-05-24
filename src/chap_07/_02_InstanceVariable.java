package chap_07;

/**
 * @Title : 인스턴스 변수
 * @Content :
 */
public class _02_InstanceVariable {

    public static void main(String[] args) {
        // 처음만든 블랙박스
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "black";

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        // 신제품
        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        b2.resolution = "UHD";
        b2.price = 300000;
        b2.color = "white";
        System.out.println("------------------------");
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);


    }

}
