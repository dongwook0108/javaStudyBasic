package chap_04;

/**
 * @Title : 반복문
 * @Content : While
 */
public class _06_While {

    public static void main(String[] args) {
        int distance = 25;
        int move = 0;

        while (move < distance) {
            System.out.println("계속 움직여 !");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했음 !");
    }


}
