package chap_07;


import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

/**
 * @Title : 메소드 오버라이딩
 * @Content : 자식 클래스에서 부모 클래스 메소드 덮어 쓰는 것(재정의)
 */
public class _13_MethodOverriding {

    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

    }

}
