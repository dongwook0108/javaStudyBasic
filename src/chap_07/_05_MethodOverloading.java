package chap_07;

/**
 * @Title : 메소드 오버로딩
 * @Content : 녹화기능 메소드
 */
public class _05_MethodOverloading {

    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.recored(false, false, 5);
        System.out.println("-------------------");
        b1.recored(true, false, 3);
        System.out.println("-------------------");
        b1.recored(true, true, 5);
        System.out.println("-------------------");
        b1.recored();

    }
}
