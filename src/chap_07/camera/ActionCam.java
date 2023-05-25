package chap_07.camera;

public class ActionCam extends Camera {

    public final String lenz; // = "광각렌즈";

    public ActionCam() {
        super("액션 카메라");
        lenz = "광각렌즈";
    }

    public final void makeVideo() {
        System.out.println(this.name + " : " + this.lenz + "로 촬영한 비디오를 제작합니다.");

    }
}
