
package chap_11;

/**
 * @Title : Finally
 * @Content : 무조건 수행되어야함
 * try + catch(s)
 * try + catch(s) + finally
 * try + finally
 */
public class _04_Finally {

    public static void main(String[] args) {
        try {
            System.out.println("택시 문 열기 !");
            throw new Exception("휴무 택시");
//            System.out.println("택시 탑승");
        } catch (Exception e) {
            System.out.println("문제 발생 : " + e.getMessage());
        } finally {
            System.out.println("문을 닫는다.");
        }

        System.out.println("------------");
        try {
            System.out.println(3 / 0);
        } finally{
            System.out.println("프로그램 종료");
        }


    }
}
