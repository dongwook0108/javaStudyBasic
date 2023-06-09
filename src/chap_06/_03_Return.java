package chap_06;

/**
 * @Title : 반환값
 * @Content :
 */
public class _03_Return {

    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-1234";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress() {
        return "서울 강남구 도산대로";
    }

    // 호텔 액티비티
    public static String getActivities() {
        return "노래방, 볼링장, 수영장";
    }


    public static void main(String[] args) {
        String number = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + number);
        System.out.println("호텔 주소 : " + getAddress());
        System.out.println("호텔 액티비티 : " + getActivities());
    }

}

