package chap_04;

/**
 * @Title : 반복문
 * @Content : For
 */
public class _05_For {

    public static void main(String[] args) {
        // 반복문 사용 For
        // (선언, 조건, 증감)
        for (int i = 0; i < 10; i++) {
            System.out.println("환영합니다. 롯데리아 입니다." + i);
        }

        System.out.println("========짝수만 출력=========");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("========짝수만 출력=========");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println("==========홀수만 출력=======");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println("=======숫자 거꾸로 출력=======");
        // 5 4 3 2 1
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println("=======1부터 10까지의 합=======");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재 까지 숫자 합은 : " + sum);
        }
        System.out.println("모든 수의 총 합은 :" + sum);
    }


}
