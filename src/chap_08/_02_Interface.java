package chap_08;


import chap_08.camera.FactoryCam;
import chap_08.detctor.AdvancedFireDetector;
import chap_08.detctor.Detectable;
import chap_08.detctor.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.VideoReporter;

/**
 * @Title : 인터페이스
* @Content : 뼈대만 제공하는 구조
 * 상속(extends) 단일상속만 가능 vs implements 상속 여러개 받음
 */
public class _02_Interface {

    public static void main(String[] args) {
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("--------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("--------------");
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }


}
