package chap_09;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @Title : Iterator
 * @Content : 순회하면서 삭제도 가능
 */
public class _08_Iterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("알 수 없음");
        list.add("박명수");
        list.add("알 수 없음");
        list.add("조세호");
        list.add("알 수 없음");
        list.add("강호동");
        list.add("알 수 없음");
        list.add("김동욱");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------");
        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("---------------");
        // 커서 처음 위치로 이동
        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("---------------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("알 수 없음")) {
                it.remove(); //삭제
            }
        }
        System.out.println("---------------");
        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---------------");
        HashSet<String> set = new HashSet<>();
        set.add("박명수");
        set.add("유재석");

        Iterator<String> iteratorSet = set.iterator();
        while (iteratorSet.hasNext()) {
            System.out.println(iteratorSet.next());
        }

        System.out.println("---------------");

        // map
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("유재석", 10);
        hashMap.put("박명수", 5);

//        hashMap.iterator 제공되지 않음

        Iterator<String> iterMapKey = hashMap.keySet().iterator();
        while (iterMapKey.hasNext()) {
            System.out.println(iterMapKey.next());
        }

        System.out.println("---------------");
        Iterator<Integer> iterMapValue = hashMap.values().iterator();
        while (iterMapValue.hasNext()) {
            System.out.println(iterMapValue.next());
        }

        System.out.println("---------------");
        Iterator<Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}