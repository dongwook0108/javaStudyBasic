package chap_05;

/**
 * @Title : 배열
 * @Content : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
 */
public class _01_Array {

    public static void main(String[] args) {

        // 배열 선언 첫 번째 방법
//        String[] coffeeList = new String[4];
//        coffeeList[0] = "아메리카노";
//        coffeeList[1] = "모카";
//        coffeeList[2] = "라떼";
//        coffeeList[3] = "프라푸치노";
//
//        System.out.println(coffeeList);

        // 배열 선언 두 번째 방법
//        String coffeeList[] = new String[];

//         배열 선언 세 번째 방법
//        String[] coffeeList = new String[]{
//                "아메리카노", "모카", "라떼", "프라푸치노"
//        };

        //         배열 선언 네 번째 방법
        String[] coffeeList ={"아메리카노", "모카", "라떼", "프라푸치노"};

        System.out.println("커피주문 !!");
        System.out.println(coffeeList[0] + " 하나");
        System.out.println(coffeeList[1] + " 하나");
        coffeeList[2] = "에스프레소";
        System.out.println(coffeeList[2] + " 하나");
        System.out.println(coffeeList[3] + " 하나");

        for (String s : coffeeList) {
            System.out.println(s + "하나 주이소 !!");
        }




    }
}
