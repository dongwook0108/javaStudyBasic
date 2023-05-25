package chap_07;

import java.util.Random;

/**
 * @Title : 패키지
 * @Content : 폴더
 */
public class _11_Package {

    public static void main(String[] args) {
        //랜덤클래스
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());
        System.out.println("랜덤 정수 범위 : " + random.nextInt(10)); // 0이상 10 미만
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만
        //System.out.println("랜덤 실수 범위 : " + random.nextDouble());
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 범위 : " + (min + (max - min)) * random.nextDouble());

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        //로또번호 랜덤 추첨
        System.out.println("로또번호 : " + (random.nextInt(45) + 1));

    }

}
