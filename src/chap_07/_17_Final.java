package chap_07;


import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

/**
 * @Title : Fianl
 * @Content : 선언과 동시에 값을 초기화하고 값 변경이 불가능
 */
public class _17_Final {

    public static void main(String[] args) {
        ActionCam actionCam = new ActionCam();
//        actionCam.lenz = "표준 렌즈"; final 키워드 사용하면 못 바꿈
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();

    }


}
