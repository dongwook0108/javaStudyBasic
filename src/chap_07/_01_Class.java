package chap_07;

/**
 * @Title : 클래스
 * @Content : 객체지향 프로그래밍 (OOP)
 * 1. 유지보수 용이
 * 2. 높은 재사용성
 */
public class _01_Class {

    public static void main(String[] args) {
        //차량용 블랙박스
        //모델명, 해상도, 가격, 색상

        // 첫 번쨰 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "black";

        // 두 번쨰 제품
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "white";

        // 세 번째 제품
        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox 객체를 생성
        // bbox 객체는 BlackBox 클래스의 인스터스

    }

}
