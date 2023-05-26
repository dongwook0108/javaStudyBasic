package chap_09;


import java.util.Collections;
import java.util.LinkedList;

/**
 * @Title : 컬렉션 프레임 워크
 * @Content : LinkedList
 */
public class _05_LinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // 데이터 추가
        // 가장 맨위로
        list.addFirst("서장훈");
        System.out.println("------------");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("------------");
        list.addLast("김희철");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("------------");
        list.add(1, "김영철");
        System.out.println(list.get(1));

        //삭제
        System.out.println("------------");
        System.out.println("남은 학생 수 : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 : " + list.size());

        // 처음 학생, 마지막 학생 지우는 법
        System.out.println("------------");
        list.removeFirst();
        list.removeLast();
        System.out.println("남은 학생 수 : " + list.size());

        // 변경
        System.out.println("------------");
        list.set(0, "이수근");
        System.out.println(list.get(0));

        //확인
        list.set(0, "이수근");
        if (list.contains("김종국")) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }

        //삭제
        System.out.println("------------");
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생수 : " + list.size());
        }

        System.out.println("------------");
        // 새로운 학기 시작
        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list);
        System.out.println(list);



    }
}
