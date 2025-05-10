package stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * packageName    : stream.collectors
 * fileName       : Collector2Map
 * author         : mzc01-jungminim
 * date           : 2025. 5. 11.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 11.        mzc01-jungminim       최초 생성
 */
public class Collectors2Map {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()
                ));
        System.out.println("map1 = " + map1);


        // 키 중복 예외: java.lang.IllegalStateException: Duplicate key
//        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Banana")
//                .collect(Collectors.toMap(
//                        name -> name, // keyMapper
//                        name -> name.length() // valueMapper
//                ));
//        System.out.println("map2 = " + map2);

        Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Banana")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length(),
                        (oldVal, newVal) -> oldVal + newVal // 중복될 경우 기존 값 + 새 값
                ));
        System.out.println("map3 = " + map3);

        LinkedHashMap<String, Integer> map4 = Stream.of("Apple", "Apple", "Banana")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length(),
                        (oldVal, newVal) -> oldVal + newVal, // 중복될 경우 기존 값 + 새 값
                        () -> new LinkedHashMap<>() //  결과 Map 타입 지정
                ));
        System.out.println("map4 = " + map4);

        // 메서드 참조로 변경
        LinkedHashMap<String, Integer> map5 = Stream.of("Apple", "Apple", "Banana")
                .collect(Collectors.toMap(
                        name -> name,
                        String::length,
                        Integer::sum, // 중복될 경우 기존 값 + 새 값
                        LinkedHashMap::new
                ));
        System.out.println("map5 = " + map5);


    }
}
