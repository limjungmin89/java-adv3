package stream.basic;

import java.util.List;

/**
 * packageName    : stream.basic
 * fileName       : ImmutableMain
 * author         : mzc01-jungminim
 * date           : 2025. 5. 10.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 10.        mzc01-jungminim       최초 생성
 */
public class ImmutableMain {

    public static void main(String[] args) {
        List<Integer> originList = List.of(1,2,3,4);

        System.out.println("originList = " + originList);

        List<Integer> filterList = originList.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("filterList = " + filterList);
        System.out.println("after stream originList = " + originList);
    }
}
