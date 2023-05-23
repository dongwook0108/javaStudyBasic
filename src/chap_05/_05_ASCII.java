package chap_05;

/**
 * @Title : 아스키코드
 * @Content : 정보 교환을 위한 미국 표준 코드
 */
public class _05_ASCII {

    public static void main(String[] args) {
        // 알파벳 대문자 A는 65부터 시작, 소문자 a는 97, 숫자 0은 48
        char c = 'A';
        System.out.println(c);
        System.out.println((int) c);

        c = 'B';
        System.out.println(c);
        System.out.println((int) c);

        c++;
        System.out.println(c);
        System.out.println((int) c);

        // 세로크기 10, 가로크기 15 영화관 좌석 정보
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        // 좌석 출력
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
