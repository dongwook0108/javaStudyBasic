package chap_10.converter;

public class KRWConverter implements Convertible{

    @Override
    public void convert(int USD) {
        System.out.println(USD + "달라 = " + (USD * 1400) + " 원");
    }
}
