package chap_07.camera;

public class FactoryCam extends Camera {


    public FactoryCam() {
        this.name = "공장 카메라";
    }


    public void detectFire() {
        System.out.println("화재 감지 기능");
    }


}
