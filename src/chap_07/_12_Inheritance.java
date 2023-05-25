package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

/**
 * @Title : 상속
 * @Content : 부모 클래스에서 물려받아 자식 클래스에서 사용한다.
 */
public class _12_Inheritance {

    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }

}
