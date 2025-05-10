package stream.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * packageName    : stream.operation
 * fileName       : MapVsFlatMapMain
 * author         : mzc01-jungminim
 * date           : 2025. 5. 10.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 10.        mzc01-jungminim       최초 생성
 */
public class MapVsFlatMapMain {
    public static void main(String[] args) {

        List<List<Integer>> outerList = List.of(List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6));

        System.out.println("outerList = " + outerList);
        // for
        List<Integer> forResult = new ArrayList<>();
        for (List<Integer> integers : outerList) {
            for (Integer integer : integers) {
                forResult.add(integer);
            }
        }
        System.out.println("forResult = " + forResult);

        // map
        List<Stream<Integer>> mapStreamList = outerList.stream()
                .map(list -> list.stream())
                .toList();
        System.out.println("mapStreamList = " + mapStreamList);

        // flatMap
        List<Integer> flatMapStreamList = outerList.stream()
                .flatMap(list -> list.stream())
                .toList();
        System.out.println("flatMapStreamList = " + flatMapStreamList);

    }
}
