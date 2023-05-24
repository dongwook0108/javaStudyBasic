package chap_06;

/**
 * @Title : 메소드 오버로딩
 * @Content : 이름이 같은 메소드를 여러개 만들어줌
 * 1. 이름은 같고 전달값의 자료형, 개수가 달라야함 !
 */
public class _05_Overloading {

    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("5"));
        System.out.println(getPower(3, 3));
    }


}

