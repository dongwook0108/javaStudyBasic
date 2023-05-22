package chap_02;

/**
 * @Title : 연산자
 * @Content : 삼항 연산자
 */
public class _05_Operator5 {

    public static void main(String[] args) {

        //삼항 연산자(조건 연산자)
//        결과 = 조건 ? 참 : 거짓

        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println("max = " + max);

        int min = (x < y) ? x : y;
        System.out.println("min = " + min);

        boolean b = (x == y) ? true : false;
        System.out.println("b = " + b);

        String s = (x != y) ? "달라 !!" : "같아 !!";
        System.out.println("s = " + s);
    }

}
