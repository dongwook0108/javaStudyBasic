package chap_04;

/**
 * @Title : 반복문
 * @Content : Do While
 */
public class _07_DoWhile {

    public static void main(String[] args) {
        //반복문 Do While
        int distance = 25; // 전체 거리
        int move = 0;      // 현재 이동 거리
        int height = 2;

        while ((move + height) < distance) {
            System.out.println("계속 움직여 !");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했음 !");

        System.out.println("----------------------");

        // 키가 개큼
        move = 0;
        height = 25;
        while ((move + height) < distance) {
            System.out.println("계속 움직여 !");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했음 !");

        System.out.println("----------------------");
        // Do While
        do {
            System.out.println("계속 움직여 !");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while ((move + height) < distance);
        System.out.println("도착했음 !");
    }


}
