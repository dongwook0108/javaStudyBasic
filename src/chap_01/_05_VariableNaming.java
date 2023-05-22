package chap_01;

/**
 * @Title : 변수 네이밍
 * @Content : 1.저장할 값에 어울리는 이름 2. 밑줄(_), 문자(abc), 숫자(123) 사용가능 3. 공백 사용 불가능 4. 밑줄 또는 문자로 시작가능(숫자는 시작
 * X) 5. 한 단어 2개 이상의 단어의 연속 6. 소문자로 시작, 각 단어의 시작 글자는 대문(첫 단어는 제외) 7. 예약어는 사용 불가(double, static,
 * void, int..)
 */
public class _05_VariableNaming {

    public static void main(String[] args) {
        // 입국 신고서 (여행)
        String nationality = "대한민국"; //국적
        String firstName = "동욱";
        String lastName = "김";
        String dateOfBirth = "1995-01-08";
        String residentialAddress = "하야트 호텔";
        String purposeOfVisit = "관광";
        String flightNumber = "HTE3311";
        String _flightNumber = "HTE3311"; // 밑줄 시작
        String flight_number_2 = "HTE3311"; // 밑줄과 숫자 포함

        int accompany = 2; //동반 가족 수
        int lenthOfStay = 5; //체류 기간

        String item1 = "시계";
        String item2 = "가방";
//        String 3item = "시계"; // 숫자 시작 x

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";

//        CODE = "USA"; // 바꿀 수 없음

    }

}
