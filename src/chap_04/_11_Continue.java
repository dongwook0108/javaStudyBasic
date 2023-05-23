package chap_04;

/**
 * @Title : Continue
 * @Content :
 */
public class _11_Continue {

    public static void main(String[] args) {
        //Continue

        // 치킨 주문손님중에 노쇼 손님 발생
        // For
        int max = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 남왔습니다.");

            // 노쇼 !
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 넘어갑니다. ");
                continue;
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료 소진 !");
                break;
            }

        }
        System.out.println("영업 종료되었습니다 !");

        System.out.println("----------while------------");
        int index = 1;
        sold = 0;
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            // index++ -> index < 50 으로 바꿔줌
            // 노쇼 고객 발생
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 넘어갑니다.");
                index++;
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료 소진이요");
                break;
            }
            index++;
        }
        System.out.println("영업 종료 !!");
    }


}
