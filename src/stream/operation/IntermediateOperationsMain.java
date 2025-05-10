package stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * packageName    : stream.operation
 * fileName       : IntermediateOperationsMain
 * author         : mzc01-jungminim
 * date           : 2025. 5. 10.
 * description    : 중간 연산(Intermediate Operation)이란, 스트림 파이프라인에서 **데이터를 변환, 필터링, 정렬 등**을 하는 단계이다.
 * **filter** 조건에 맞는 요소만 남김`stream.filter(n -> n > 5)`
 * **map** 요소를 다른 형태로 변환`stream.map(n -> n * 2)`
 * **flatMap** 중첩 구조 스트림을 일차원으로 평탄화`stream.flatMap(list -> list.stream())`
 * **distinct** 중복 요소 제거`stream.distinct()`
 * **sorted** 요소 정렬`stream.sorted()` / `stream.sorted(Comparator.reverseOrder())`
 * **peek** 중간 처리 (로그, 디버깅)`stream.peek(System.out::println)`
 * **limit** 앞에서 N개의 요소만 추출`stream.limit(5)`
 * **skip** 앞에서 N개의 요소를 건너뛰고 이후 요소만 추출 `stream.skip(5)`
 * **takeWhile** 조건을 만족하는 동안 요소 추출 (Java 9+)`stream.takeWhile(n -> n < 5)`
 * **dropWhile** 조건을 만족하는 동안 요소를 버리고 이후 요소 추출 (Java 9+) `stream.dropWhile(n -> n < 5)`
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 10.        mzc01-jungminim       최초 생성
 */
public class IntermediateOperationsMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,2, 3,4,5, 5,6,7,8,9,10);

        // 1. filter
        System.out.println("1. filter - 짝수만 선택");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // 2. map
        System.out.println("2. map - 각 숫자를 제곱");
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

        // 3.distinct
        System.out.println("3. distinct - 중복 제거");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        // 4. sorted - 기본정렬
        System.out.println("4. sort - 기본정렬");
        Stream.of(3,1,2,3,5,4,2,6,7,8,10,1)
                .sorted()
                .forEach(System.out::println);

        // 5. sorted - 커스텀정렬
        System.out.println("5. sort - 커스텀정렬");
        Stream.of(3,1,2,3,5,4,2,6,7,8,10,1)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // 6. peek
        System.out.println("6. peek - 동작 확인용");
        numbers.stream()
                .peek(n-> System.out.print("before: " + n + ", "))
                .map(n-> n * n)
                .peek(n -> System.out.print("after: " + n + ", "))
                .limit(5)
                .forEach(System.out::println);

        // 7. limit 해당 수 만큼만 stream 반복
        System.out.println("7. limit - 처음 5개 요소만");
        numbers.stream()
                .limit(5)
                .forEach(System.out::println);

//        Stream.iterate(0, n -> n + 2)
//                .limit(5)
//                .forEach(System.out::println);

        // 8. skip 해당 수 만큼 스킵후 나머지 실행
        System.out.println("8. skip - 처음 5개 요소를 건너뛰기");
        numbers.stream()
                .skip(5)
                .forEach(System.out::println);

        // 9. takeWhile 다음 조건에 해당하는 동안만 유지 (java9+)
        System.out.println("9. takeWhile - 5보다 작은 동안만 선택");
        numbers.stream()
                .takeWhile(n -> n < 5)
                .forEach(System.out::println);

        // 10. dropWhile 다음 조건에 해당하면 건너 뛰기(java9+)
        System.out.println("10. dropWhile - 5보다 작은 동안 건너뛰기");
        numbers.stream()
                .dropWhile(n -> n<5)
                .forEach(System.out::println);
    }
}
