package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

/**
 * @Title : 추상화
 * @Content : 데이터 추상화 - 보여줄건 보여주고, 숨길거는 숨기쟈 !
 * abstract 추상 클래스 - 완성되지 않은 형태의 클래스
 * 추상 메소드 - 추상 클래스에서만 사용 가능한 껍데기만 있는 메소드
 */
public class _01_AbstractClass {

    public static void main(String[] args) {
//        Camera camera = new Camera(); // 추상클래스는 객체로 만들 수 없음 -> 추상클래스를 상속 한 다른 클래스는 사용 가능
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();
        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

    }


}
