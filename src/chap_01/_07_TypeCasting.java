package chap_01;

/**
 * @Title : 형변환
 * @Content : 정수형 -> 실수형, 실수형 -> 정수형
 */
public class _07_TypeCasting {

    public static void main(String[] args) {

//        int score = 92 + 93.2; -> 사용 불가능
//        int -> float, double
        int score = 91;
        System.out.println(score);           // 91
        System.out.println((float) score);   //91.0
        System.out.println((double) score);   //91.0

//        float, double -> int
        float score_f = 91.7F;
        double score_d = 87.4;

        System.out.println((int) score_f); // 92
        System.out.println((int) score_d); // 87

//        정수 + 실수 연산
        score = 80 + (int) 78.5;   // 80 + 78
        System.out.println(score);

        score_d = 89 + 48.5; // double 사용할 필요 x
        System.out.println(score_d);

//        변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score;
        // int -> long -> float -> double (작은 범위에서 큰 범위) 자동 형변환

        int convertedScoreInt = (int) score_d;
        // double -> float -> long -> int (수동 형변환)

//        숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); //93

        String s2 = String.valueOf(96.5);
        s2 = Double.toString(96.5);
        System.out.println("s2 = " + s2);

//        문자열을 숫자열로
        int i = Integer.parseInt("89");
        System.out.println("i = " + i);

        double d = Double.parseDouble("45.9");
        System.out.println("d = " + d);
    }

}
