package stream.start;

import java.util.List;
import java.util.stream.Stream;

/**
 * packageName    : stream.start
 * fileName       : StreamStartMain
 * author         : mzc01-jungminim
 * date           : 2025. 5. 10.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 10.        mzc01-jungminim       최초 생성
 */
public class StreamStartMain {

    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Banana", "Berry", "Tomato");

        Stream<String> stream = names.stream();
        List<String> result = stream
                .filter(name->name.startsWith("B"))
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println("=== 외부 반복 ====");

        for(String s:result) {
            System.out.println(s);
        }

        names.stream()
                .filter(name->name.startsWith("B"))
                .map(s->s.toUpperCase())
                .forEach(s -> System.out.println(s));

        System.out.println("=== 내부 반복 ====");

        names.stream()
                .filter(name ->name.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("=== 내부 반복 메서드 참조 변경====");

    }
}
