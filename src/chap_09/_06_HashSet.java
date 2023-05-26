package chap_09;


import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @Title : 컬렉션 프레임 워크
 * @Content : HashSet
 * 1. 중복 허용 x
 * 2. 순서 보장 x
 */
public class _06_HashSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("삼겹살");
        set.add("후추");
        set.add("야채");
        set.add("삼겹살");

        System.out.println("총 구매 : " + set.size());

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("---------------------");

        // 데이터 확인
        if (set.contains("삼겹살")) {
            System.out.println("삽겹살 사러가즈아ㅏ");
        }

        System.out.println("---------------------");
        //삭제
        System.out.println("삼결살 구매 전 : " + set.size()); // 6
        set.remove("삼겹살");
        System.out.println("삼결살 구매 후 : " + set.size()); // 5

        System.out.println("---------------------");

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 상품 수 : " + set.size());
            System.out.println("집가즈아ㅏ");
        }

        System.out.println("---------------------");
        // 중복 x, 순서 보장 x
        // 순서 보장이 필요할 시 LinkedHashSet 사용
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
        intSet.add(9);

        for (Integer integer : intSet) {
            System.out.println(integer);
        }
        System.out.println("---------------------");
        HashSet<Integer> integers = new LinkedHashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);

        for (int i : integers) {
            System.out.println(i);
        }




    }
}
