package chap_05;

/**
 * @Title : 배열순회
 * @Content :배열의 길이를 이용한 순회,enhanced for (for-each)
 */
public class _02_ArrayLoop {

    public static void main(String[] args) {
        // 배열의 순회
        String[] coffeeList = {"아메리카노", "모카", "라떼", "프라푸치노"};

        // for
        for (int i = 0; i < 4; i++) {
            System.out.println(coffeeList[i] + "하나 !!");
        }
        System.out.println("주세요");

        System.out.println("--------------------");
        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffeeList.length; i++) {
            System.out.println(coffeeList[i] + "하나 !!");
        }
        System.out.println("주세요");

        System.out.println("--------------------");
        // enhanced for (for-each)
        for (String coffee : coffeeList) {
            System.out.println(coffee + " 하나 !!");
        }
        System.out.println("주세요");


    }
}
