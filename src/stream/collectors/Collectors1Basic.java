package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * packageName    : stream.collectors
 * fileName       : Collectors1Basic
 * author         : mzc01-jungminim
 * date           : 2025. 5. 11.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 11.        mzc01-jungminim       최초 생성
 */
public class Collectors1Basic {
    public static void main(String[] args) {
        // 기본 기능
        List<String> list = Stream.of("Java", "Spring", "JPA")
                .collect(Collectors.toList());
        System.out.println("list = " + list);

        List<Integer> unmodifiableList = Stream.of(1,2,3)
                .collect(Collectors.toUnmodifiableList());
        System.out.println("unmodifiableList = " + unmodifiableList);

        Set<Integer> collect = Stream.of(1, 2, 2, 3, 3, 3)
                .collect(Collectors.toSet());
        System.out.println("collect = " + collect);

        TreeSet<Integer> collect1 = Stream.of(3, 4, 5, 2, 1)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("collect1 = " + collect1);
    }
}
