package chap_09;

/**
 * @Title : Wrapper 클래스
 * @Content : 기본 자료형 객첵 -> 객체 형태로 만들어줌
 */
public class _03_WrapperClass {

    public static void main(String[] args) {
        Integer i = 123;
        Double d  = 1.0;
        Character c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("------------");

        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println("------------");
        String s = i.toString();
        System.out.println(s);
    }

}
