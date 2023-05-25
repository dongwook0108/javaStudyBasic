package chap_07;


import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

/**
 * @Title : Super
 * @Content : 부모 클래스에 어떤거를 자식클래스에서 사용함
 */
public class _15_Super {

    public static void main(String[] args) {
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("---------");
        speedCam.takePicture();


    }

}
