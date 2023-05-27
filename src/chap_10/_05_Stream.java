package chap_10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Title : Stream
 * @Content :
 */
public class _05_Stream {

    public static void main(String[] args) {
        // stream 생성

        // 배열에서 만드는법
        // Arrays.stream
        int[] scores = {100, 90, 80, 70, 60};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "c++", "javascript", "c#"};
        Stream<String> langsStream = Arrays.stream(langs);
//        System.out.println(langsStream.collect(Collectors.toList()));

        // Collection.stream
        List<String> langList = new ArrayList<>();
//        langList.add("python");
//        langList.add("java");

        langList = Arrays.asList("python", "java", "c++", "javascript", "c#");
//        System.out.println(langList.size());

        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "c++", "javascript", "c#");

        // stream 사용
        // 중간 연산(intermediate operator) filter, sorted, map, skip
        // 최종 연산(terminal operator) count, min, max, sum, foreach, anyMatch

        // 90점 이상만 구함
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
//        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("----------------");

        // 90점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("----------------");

        // 90점 이상인 사람들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("----------------");

        // 80 점 이상인 점수들 정렬해서 출력
        Arrays.stream(scores).filter(x -> x >= 80).sorted().forEach(System.out::println);
        System.out.println("----------------");

        // c로 시작하는 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("----------------");

        //java를 포함하는 언어 뽑기
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("----------------");

        // 글자가 4자 이하 정렬해서 출력
//        Arrays.stream(langs).filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("----------------");

        // 글자가 4자 이하 언어 중 c 포함 하는 단어
//        langList.stream().filter(x -> x.length() <= 4 && x.contains("c")).forEach(
//                System.out::println);

        langList.stream().filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);
        System.out.println("----------------");

        // 글자가 4자 이하 언어 중 c 포함 하는 단어가 있는지 여부
        boolean flag = langList.stream().filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        System.out.println(flag);
        System.out.println("----------------");

        // 글자가 4자 이하 언어 중 c 모두 c를 포함하나요?
        boolean allMatch = langList.stream().filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch);

    }

}
