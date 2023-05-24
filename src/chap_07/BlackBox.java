package chap_07;

public class BlackBox {

    String modelName;
    String resolution;
    int price;
    String color;

    static boolean canAutoReport = false; // 자동 신고 기능
    // static 선언 시 클래스 변수


    public void autoRepory() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동으로 신고기능이 없습니다.");
        }
    }

    public void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량 :" + capacity);
    }

    public int getVideoFileCount(int type) {
        if (type == 1) { //일반 영상
            return 10;
        } else if (type == 2) {
            return 2;
        } else {
            return 11;
        }
    }

    public void recored(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다. ");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }

        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록 됩니다.");
    }

    public void recored() {
        recored(true, true, 10);
    }
}
