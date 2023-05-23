package chap_06;

/**
 * @Title : 메소드
 * @Content : 기능을 하는 코드들의 묶음
 */
public class _01_Method {

    // 메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요 ~");
    }

    public void sayHello2() {
        System.out.println("안녕하세요");
    }


    public static void main(String[] args) {
        _01_Method hello = new _01_Method();
        hello.sayHello2();
        sayHello();


    }

}
