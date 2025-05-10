package stream.operation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * packageName    : stream.operation
 * fileName       : TerminalOperationMain
 * author         : mzc01-jungminim
 * date           : 2025. 5. 10.
 * description    : 최종 연산
 * 최종 연산(Terminal Operation)은 스트림 파이프라인의 **끝**에 호출되어 **실제 연산을 수행**하고 결과를 만들어낸다. 최종 연산이 실행된 후에 스트림은 소모되어 더 이상 사용할 수 없다.
 * **collect** Collector를 사용하여 결과 수집 (다양한 형태로 변환 가능) `stream.collect(Collectors.toList())`
 * **toList (Java16+)** 스트림을 불변 리스트로 수집`stream.toList()`
 * **toArray** 스트림을 배열로 변환`stream.toArray(Integer[]::new)`
 * **forEach** 각 요소에 대해 동작 수행 (반환값 없음) stream.forEach(System.out::println)
 * **count** 요소 개수 반환`long count = stream.count();`
 * **reduce** 누적 함수를 사용해 모든 요소를 단일 결과로 합침 초깃값이 없으면 Optional로 반환 `int sum = stream.reduce(0, Integer::sum);`
 * **min / max** 최솟값, 최댓값을 Optional로 반환`stream.min(Integer::compareTo)` ,`stream.max(Integer::compareTo)`
 * **findFirst** 조건에 맞는 첫 번째 요소 (Optional 반환) `stream.findFirst()`
 * **findAny** 조건에 맞는 아무 요소나 (Optional 반환) `stream.findAny()`
 * **anyMatch** 하나라도 조건을 만족하는지 (boolean)`stream.anyMatch(n -> n > 5)`
 * **allMatch** 모두 조건을 만족하는지 (boolean)`stream.allMatch(n -> n > 0)`
 * **noneMatch** 하나도 조건을 만족하지 않는지 (boolean) `stream.noneMatch(n -> n < 0)`
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 10.        mzc01-jungminim       최초 생성
 */
public class TerminalOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,2,3,4,5,5,6,7,8,9,10);

        // Collector 는 뒤에서 더 자세히
        System.out.println("1. collect - List 수집");
        List<Integer> evenNumbers1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("evenNumbers1 = " + evenNumbers1);

        System.out.println("2. toList() - java16+");
        List<Integer> evenNumbers2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("evenNumbers2 = " + evenNumbers2);

        System.out.println("3. toArray - 배열로 변환");
        Integer[] array = numbers.stream()
                .toArray(Integer[]::new);
        System.out.println("array = " + array);

        System.out.println("4. forEach - 각 요소 처리");
        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));

        System.out.println("5. count - 요소 개수");
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("count = " + count);

        System.out.println("6. reduce - 요소들의 합");
        System.out.println("초기 값이 없는 reduce");
        Optional<Integer> reduce1 = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("reduce1 = " + reduce1.get());

        System.out.println("초기 값이 있는 reduce");
        Integer reduce2 = numbers.stream()
                .reduce(100, (a, b) -> a + b);
        System.out.println("reduce2 = " + reduce2);

        System.out.println("7. min - 최솟값");
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("min = " + min.get());

        System.out.println("8. max - 최댓값");
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("max = " + max.get());

        System.out.println("9. findFirst - 첫 번째 요소");
        Optional<Integer> findFirst = numbers.stream()
                .filter(n -> n > 5)
                .findFirst();
        System.out.println("findFirst = " + findFirst.get());

        System.out.println("10. findAny - 아무 요소나 하나 찾기");
        Optional<Integer> findAny = numbers.stream()
                .filter(n -> n > 5)
                .findAny();
        System.out.println("findAny = " + findAny.get());

        System.out.println("11. anyMatch - 조건을 만족하는 요소 존재 여부");
        boolean anyMatch = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println("anyMatch = " + anyMatch);

        System.out.println("12. allMatch - 모든 요소가 조건을 만족하는지");
        boolean allMatch = numbers.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println("allMatch = " + allMatch);

        System.out.println("13. noneMatch - 조건을 만족하는 요소가 없는지");
        boolean noneMatch = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println("noneMatch = " + noneMatch);

    }
}
