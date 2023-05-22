package chap_02;

/**
 * 문제 - 어린이 키에 따른 놀이기구 탑승 유무 확인 조건
 */
public class _Quiz_02 {

    public static void main(String[] args) {

        int height = 132;

        String result = (height > 120) ? ("키가 " + height + "cm 이므로 탑승 가능합니다.")
                : ("키가  " + height + "cm 이므로 탑승 불가능합니다.");

        System.out.println("result = " + result);

    }
}
