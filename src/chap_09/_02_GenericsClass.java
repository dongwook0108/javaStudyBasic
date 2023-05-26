package chap_09;

import chap_09.coffee.Coffee;
import chap_09.coffee.CoffeeByName;
import chap_09.coffee.CoffeeByNickname;
import chap_09.coffee.CoffeeByNumber;
import chap_09.coffee.CoffeeByUser;
import chap_09.user.User;
import chap_09.user.VIPUser;

/**
 * @Title : 제네릭 클래스
 * @Content : 커피주문 예시
 * 하나의 클래스에서 여러가지 타입을 받아서 처리함
 * 코드 중복 x, 형변환 x -> 실수를 줄여줌
 */
public class _02_GenericsClass {

    public static void main(String[] args) {

        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("================");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("================");
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호" + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름" + c4Name);

        System.out.println("================");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println(c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println(c6Name);

        System.out.println("================");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("김동욱"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("김동욱2"));
        c8.ready();

        System.out.println("================");
        orderCoffee(36);

        System.out.println("================");
        orderCoffee("김동욱12", "아아");
        orderCoffee("37", "라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 주문 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + "주문 완료 : " + name);
    }

}
