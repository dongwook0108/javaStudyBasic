package chap_07;

public class BlackBox {

    String modelName;
    String resolution;
    int price;
    String color;

    int serialNumber;

    static int counter = 0;

    static boolean canAutoReport = false; // 자동 신고 기능
    // static 선언 시 클래스 변수

    //생성자 만드는 법
    public BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다. " + this.serialNumber);
    }

    public BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 기본 생성자 호출
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }


    public void autoReport() {
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

    public static void callServiceCenter() {
        System.out.println("서비스 센터 1588-1100으로 연결합니다.");
//        modelName = "test";// static 으로 선언되어있지 않으므로 변경 불가능
        canAutoReport = true; // static 으로 선언된 클래스 변수는 static 메서드에서 바로 사용이 가능함
    }

    public void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의 하세요";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

}
