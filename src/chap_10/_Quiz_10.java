package chap_10;


import java.util.ArrayList;

/**
 * 스트림을 이용하여 미술관 박물관 손님에게 적절한 입장료를 안내하는 프로그램을 작성 하시오
 * 조건
 * 1. Customer 클래스 생성
 * 2. 입장료는 1인당 5000
 * 3. 20세 이상 손님들에게만 부과(그 외에는 무료)
 */
public class _Quiz_10 {

    public static void main(String[] args) {

        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("챈들러", 50));
        list.add(new Customer("모니카", 42));
        list.add(new Customer("레이첼", 21));
        list.add(new Customer("벤자민", 18));
        list.add(new Customer("제임스", 5));

        System.out.println("미술관 입장료");
        list.stream().map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료")
                .forEach(System.out::println);
    }
}

class Customer {
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}




