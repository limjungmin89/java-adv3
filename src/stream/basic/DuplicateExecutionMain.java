package stream.basic;

import java.util.List;
import java.util.stream.Stream;

/**
 * packageName    : stream.basic
 * fileName       : DuplicateExecutionMain
 * author         : mzc01-jungminim
 * date           : 2025. 5. 10.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 10.        mzc01-jungminim       최초 생성
 */
public class DuplicateExecutionMain {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3);
        stream.forEach(System.out::println); // 1. 최초 실행

//        System.out.println("stream = " + stream); // 2. 두번째 실행

        List<Integer> list = List.of(1,2,3,4);
        Stream.of(list).forEach(System.out::println);
        Stream.of(list).forEach(System.out::println);
    }
}
