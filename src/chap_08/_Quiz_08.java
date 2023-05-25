package chap_08;


import chap_08.camera.SpeedCam;
import chap_08.detctor.AccidentDetector;
import chap_08.reporter.VideoReporter;

/**
 * 인터페이스를 이용하여 과속 단속 카메라에 교통 사고 감지 및 신고 기능을 추가하시오
 * 조건
 *
 *
 */
public class _Quiz_08 {

    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }


}





