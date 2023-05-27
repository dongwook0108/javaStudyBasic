package chap_11;

/**
 * @Title : 사용자 정의 예외처리
 * @Content :
 */
public class _06_CustomException {

    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 19) {
//                System.out.println("담배판매금지");
                throw new AgeLessThan19Exception("담배 구매할 수 없어요");
            } else {
                System.out.println("담배드립니다.");
            }
        } catch (AgeLessThan19Exception e) {
            System.out.println("조금 더 성장하고 오이소!");
        } catch (Exception e) {
            System.out.println("모든 예외를 처리합니다.");
        }


    }
}

class AgeLessThan19Exception extends Exception {

    public AgeLessThan19Exception(String message) {
        super(message);
    }
}
