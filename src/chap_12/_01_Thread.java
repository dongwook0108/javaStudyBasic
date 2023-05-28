package chap_12;

import chap_12.clean.CleanThread;

/**
 * @Title : Thread
 * @Content : 작업을 실행하는 것
 * 하나의 프로세스가 실행 -> 프로세스는 쓰레드를 가짐
 *
 */
public class _01_Thread {

    public static void main(String[] args) {
//        cleanBySelf();
        CleanThread cleanThread = new CleanThread();
//        cleanThread.run();
        cleanThread.start();
        cleanByBoss();

    }

    public static void cleanBySelf() {
        System.out.println("혼자서 청소 시작");
        for (int i = 1; i <= 10; i+= 2) {
            System.out.println("혼자 " + i + "번 방 청소중");
        }
        System.out.println("청소끝");
    }

    public static void cleanByBoss() {
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("사장 " + i + "번 방 청소중");
        }
        System.out.println("사장 청소끝");
    }


}
