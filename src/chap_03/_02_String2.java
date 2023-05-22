package chap_03;

/**
 * @Title : 문자열
 * @Content : 문자열 변환(replace, subString, concat)
 */
public class _02_String2 {

    public static void main(String[] args) {
        String s = "I like Java and Spring and Db.";

        System.out.println("s.replace(\" and\"), \",\" = " + s.replace(" and", ","));
        System.out.println("s.substring(7) = " + s.substring(7)); // index 기준 7번째
        System.out.println("s.substring(s.indexOf(\"java\")) = " + s.substring(s.indexOf("Java")));
        System.out.println(
                "s.substring(s.indexOf(\"Java\"), s.lastIndexOf(\".\")) = " + s.substring(
                        s.indexOf("Java"), s.indexOf(".")));

        //공백제거
        s = "        I like Java.         ";
        System.out.println("s = " + s);
        System.out.println("s.trim() = " + s.trim());

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println("s1 + s2 = " + s1 + s2);
        System.out.println("s1 + s2 = " + s1.concat(", ").concat(s2));


    }

}
