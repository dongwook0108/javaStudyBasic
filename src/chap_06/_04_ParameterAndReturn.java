package chap_06;

/**
 * @Title : 전달값과 반환값
 * @Content : 전달값과 반환값이 있는 메소드
 */
public class _04_ParameterAndReturn {

    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int returnValue = getPower(10);
        System.out.println(returnValue);

        returnValue = getPower(5);
        System.out.println(returnValue);

        int powerByExp = getPowerByExp(3, 3);
        System.out.println(powerByExp);

        System.out.println(getPowerByExp(2, 5));
    }

}

