package chap_04;

/**
 * 조건문을 활용해서 주차 정산 프로그램을 작성
 * 조건
 * 1. 주차 요금은 시간당 4000원
 * 2. 경차 또는 장애인 차량은 최종요금에서 50% 할인
 * 3. 일일 최대 요금은 30000원
 *
 */
public class _Quiz_04 {

    public static void main(String[] args) {
        int hour = 15;
        boolean isSmallCar = false;
        boolean withDisabledPerson = false;
        int finalFee = (hour * 4000);

        if (finalFee > 30000) {
            finalFee = 30000;
        }

        if (isSmallCar || withDisabledPerson) {
            finalFee /= 2;
        }

        System.out.println("주차요금은 " + finalFee + "원 입니다.");

    }
}
