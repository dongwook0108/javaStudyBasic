package chap_07;

/**
 * @Title : 메소드
 * @Content :
 */
public class _04_Method {

    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.autoRepory(); // 지원 x
        BlackBox.canAutoReport = true;
        b1.autoRepory(); // 지원 o
        b1.insertMemoryCard(400);

        //일반 영상
        int videoFileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수 :" + videoFileCount+ "개");
        //충돌감지 영상
        videoFileCount = b1.getVideoFileCount(2);
        System.out.println("충돌 감지 영상 파일 수 :" + videoFileCount+ "개");
    }
}
