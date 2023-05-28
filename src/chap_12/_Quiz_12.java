package chap_12;

/**
 * 상품 A와 상품 B로 이루어진 세트 상품을 효율적으로 포장하는 프로그램
 * 조건
 * 1. 상품 A와 상품 B는 각각 5개
 * 2. 독립적으로 준비
 * 3. 상품 A와 상품 B가 모두 준비된 이후 세트 상품 포장 시작
 */
public class _Quiz_12 {

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
//                product.pack("A");
            }
            System.out.println("A 상품 준비 완료");
        };
        Runnable runnable2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
//                product.pack("B");
            }
            System.out.println("B 상품 준비 완료");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable runnableSet = () -> {
            System.out.println("세트 상품 포장 시작");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println("세트 준비 완료");
        };

        Thread thread = new Thread(runnableSet);
        thread.start();


    }
}

