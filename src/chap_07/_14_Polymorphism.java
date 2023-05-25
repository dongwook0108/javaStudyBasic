package chap_07;


import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

/**
 * @Title : 다형성, 형변환
 * @Content : class Person : 사람
 * class Student extends Person : 학생 (학생은 사람이다. Student is a person)
 * class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)
 */
public class _14_Polymorphism {

    public static void main(String[] args) {
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("---------------");
        //이점은 뭔가?
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        if (camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam) factoryCam).detectFire(); // 형변환
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

    }

}
