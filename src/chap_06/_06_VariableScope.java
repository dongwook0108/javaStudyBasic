package chap_06;

/**
 * @Title : 범위
 * @Content : 지역변수 - 변수가 선언된 그 영역(중괄호) 내에서만 사용 가능
 */
public class _06_VariableScope {

    public static void methodA() {
//        System.out.println(number);
    }

    public static void methodB() {
        int result = 1;
    }

    public static void main(String[] args) {
        int number = 3;
//        System.out.println(result);

        for (int i = 0; i <5; i++) {
            System.out.println(i);
        }
//        System.out.println(i);



    }

}

