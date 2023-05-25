package chap_07.camera;

public class FactoryCam extends Camera {


    public FactoryCam() {
//        this.name = "공장 카메라";
        super("공장 카메라");
    }

    public void recordVideo() {
        super.recordVideo();
        detectFire();
    }


    public void detectFire() {
        System.out.println("화재 감지 기능");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
