package chap_10;


import chap_10.converter.Convertible;
import chap_10.converter.KRWConverter;

/**
 * @Title : 함수형 인터페이스
 * @Content :
 */
public class _04_FunctionalInterface {

    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(30);

//        convertUSD((USD) -> System.out.println(USD + "달라 = " + (USD * 1400) + " 원"), 10);
        Convertible convertible = (USD) -> System.out.println(USD + "달라 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 1);

    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }


}
