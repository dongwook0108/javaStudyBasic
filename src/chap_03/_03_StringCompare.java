package chap_03;

/**
 * @Title : 문자열 비교 (StringCompare)
 * @Content : equalsIgnoreCase ,equals, == 비교
 */
public class _03_StringCompare {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Spring";

        System.out.println(s1.equals("Java")); // 값이 같으면 true, 다르면 false
        System.out.println(s2.equals("spring")); // 대소문자도 비교
        System.out.println(s2.equalsIgnoreCase("spring")); // 대소문자 구분없이 문자열 내용 체크

        // 문자열 비교 심화
        s1 = "1234"; // 참조
        s2 = "1234";

        System.out.println(s1.equals(s2)); //true 내용비교
        System.out.println(s1 == s2);      //true 참조비교

        s1 = new String("1234");   //다른곳을 참조함 메모리 주소가 다름
        s2 = new String("1234");

        System.out.println(s1.equals(s2));  //true
        System.out.println(s1 == s2);       //false


    }

}
