package chap_11;

/**
 * @Title : 예외처리
 * @Content :
 * 컴파일 오류 : 빌드 자체가 안됨
 * 런타임 오류 : 컴파일 가능 -> 실행 중에서 문제
 * 런타임 -> 에러(우리가 해결 x(스택오버플로우에러)), 예외(코드로 해결가능)
 */
public class _01_TryCatch {

    public static void main(String[] args) {

        try {
//            System.out.println(3 / 0);
//            int[] arr = new int[3];
//            arr[5] = 100;
//            Object obj = "test";
//            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("문제 발생 : " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");

    }


}
