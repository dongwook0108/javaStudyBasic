
package chap_11;

/**
 * @Title : Throw
 * @Content :
 */
public class _03_Throw {

    public static void main(String[] args) {
        int age = 17;

        try {
            if (age < 19) {
//                System.out.println("담배판매금지");
                throw new Exception("담배 구매할 수 없어요");
            } else {
                System.out.println("담배드립니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
