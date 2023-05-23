package chap_05;

/**
 * @Title : 다차원 배열(2차원 배열)
 * @Content :
 */
public class _03_MultidimensionalArray {

    public static void main(String[] args) {
        // 다차원 배열(2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - C5
        // C1 - C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3 x 5 크기 배열
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // B2 좌석 찾기
        System.out.println(seats[1][1]);

        // C5 좌석 찾기
        System.out.println(seats[2][4]);

        // 첫 줄 3칸, 둘째 줄 4칸, 셋째 줄 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        // A3 좌석 찾기
        System.out.println(seats2[0][2]);


    }
}
