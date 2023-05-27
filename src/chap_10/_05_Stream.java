package chap_10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Title : Stream
 * @Content :
 */
public class _05_Stream {

    public static void main(String[] args) {
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
        System.out.println(langList.size());

        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "c++", "javascript", "c#");
    }

}
