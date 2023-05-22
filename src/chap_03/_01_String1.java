package chap_03;

/**
 * @Title : 문자열
 * @Content : length, toUpperCase, toLowerCase, contains, indexOf, lastIndexOf, startsWith, endsWith
 */
public class _01_String1 {

    public static void main(String[] args) {
        String s = "I like Java and Spring and Db.";
        System.out.println("s = " + s);

        // 문자열 길이
        System.out.println("s.length() = " + s.length());

        // 대소문자 변환
        System.out.println("s.toUpperCase() = " + s.toUpperCase()); //대문자로
        System.out.println("s.toLowerCase( = " + s.toLowerCase());  //소문자로

        //포함 관계
        System.out.println("s.contains(\"Java\") = " + s.contains("Java")); //ture
        System.out.println("s.contains(\"C\") = " + s.contains("C"));       //false

        //위치정보
        System.out.println("s.indexOf(\"Java\") = " + s.indexOf("Java")); // index 0부터 시작함
        System.out.println("s.indexOf(\"C\") = " + s.indexOf("C"));       // 문자 정보가 없으면 -1로 표시

        System.out.println("s.indexOf(\"and\") = " + s.indexOf("and"));             //처음 일치하는 위치 정보
        System.out.println("s.lastIndexOf(\"and\") = " + s.lastIndexOf("and")); //마지막 일치하는 위치 정보

        System.out.println("s.startsWith(\"I like\") = " + s.startsWith("I like")); //이 문자열로 시작하면 true 아니면 false
        System.out.println("s.endsWith(\".\") = " + s.endsWith("."));



    }

}
