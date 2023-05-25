package chap_07.camera;

public class Camera {

    public String name;

    public Camera() {
        this.name = "카메라";
    }

    public void takePicture() {
        System.out.println(this.name + " : 사진을 촬영합니다.");

    }

    public void recordVideo() {
        System.out.println(this.name + " : 비디오를 녹화합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 사진 촬영, 동영상 녹화");
    }



}
