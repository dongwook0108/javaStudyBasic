package chap_09;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Title : 컬렉션 프레임 워크
 * @Content : ArrayList
 * 1. 많은 데이터를 쉽고, 효율적으로 관리하기 위한 자바에서 제공하는 클래스들의 모음
 * 2. List, Map, Set
 */
public class _04_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("김동욱0");
        list.add("김동욱1");
        list.add("김동욱2");
        list.add("김동욱3");
        list.add("김동욱4");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("--------------");
        // 삭제
        System.out.println("신청 학생 수 : " + list.size());
        list.remove("김동욱3");
        System.out.println("신청 학생 수 : " + list.size());
        System.out.println(list.get(3));

        System.out.println("--------------");
        System.out.println("남은 학생 수 (제외 전) " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) " + list.size());
        System.out.println("--------------");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------");
        //데이터 변경
        System.out.println("변경 전 : " + list.get(0));

        list.set(0, "김동욱6");
        System.out.println("변경 후 : " + list.get(0));

        System.out.println("--------------");
        //확인
        System.out.println(list.indexOf("김동욱2"));
        // 5명 내에 포함인가요?
        System.out.println("--------------");
        System.out.println(list.contains("김동욱2"));

        if (list.contains("김동욱2")) {
            System.out.println("있음");
        } else {
            System.out.println("없음");
        }

        System.out.println("--------------");
        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생수 : " +list.size());
            System.out.println("비어있습니다");
        }

        System.out.println("--------------");
        // 다음학기 신청 받음
        list.add("이동욱0");
        list.add("김동욱1");
        list.add("삼동욱2");
        list.add("오동욱3");
        list.add("육동욱4");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }




    }

}
