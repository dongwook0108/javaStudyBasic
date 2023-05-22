package chap_04;

/**
 * @Title : 구구단
 * @Content :
 */
public class _09_MultipleTable {

    public static void main(String[] args) {

        // 구구단

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "단 : " + i + " x " + j + " = " + (i * j));
            }
            System.out.println();

        }


    }


}
