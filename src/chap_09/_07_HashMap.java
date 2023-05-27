package chap_09;


import java.util.HashMap;

/**
 * @Title : 컬렉션 프레임 워크
 * @Content : HashMap
 * 1. key, value 쌍으로 이루어짐
 * 2. 순서 보장 x -> 순서 보장하고 싶다면 LinkedHashMap 사용
 * 3. key 값 중복 x
 *
 */
public class _07_HashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        //데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 10);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("------------");

        //조회
        System.out.println("유재석 포인트 : " + map.get("유재석"));
        System.out.println("박명수 포인트 : " + map.get("박명수"));
        System.out.println("------------");


        // 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("누적 포인트 : " + point);
        } else {
            map.put("서장훈", 1);
            System.out.println("적립된 포인트가 없습니다.");
        }
        System.out.println("------------");

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));
        System.out.println("------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접습니다.. ");
        }
        System.out.println("------------");

        // 다시 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 10);

        //key 확인
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("------------");

        // value 확인
        for (int i : map.values()) {
            System.out.println(i);
        }
        System.out.println("------------");

        // key, value 한번에 확인
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트는 " + map.get(key));
        }
        System.out.println("------------");
        // 중복 허용 x -> 최종값으로 변경
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트는 " + map.get(key));
        }
    }
}
