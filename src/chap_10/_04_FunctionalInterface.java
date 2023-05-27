package chap_10;


import chap_10.converter.Convertible;
import chap_10.converter.ConvertibleWithNoParam;
import chap_10.converter.ConvertibleWithReturn;
import chap_10.converter.ConvertibleWithTwoParam;
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
        convertUSD(convertible, 2);

        // 전달값이 없다면?
        ConvertibleWithNoParam c1 = () -> System.out.println("1 달라 = 1400 원 ");
        c1.convert();

        // 두 줄 이상의 코드가 필요하다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달라 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        // 전달값이 2개인 경우
        ConvertibleWithTwoParam c2 = (USD, KRW) -> System.out.println(USD + "달라 = " + (USD * KRW) + " 원");
        c2.convert(10, 1400);

        // 반환값이 있는 경우
        ConvertibleWithReturn c3 = (USD, KRW) -> {
            return USD * KRW;
        };
        int result = c3.convert(20, 1400);
        System.out.println(result);



    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }


}
