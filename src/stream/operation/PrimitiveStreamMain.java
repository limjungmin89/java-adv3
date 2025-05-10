package stream.operation;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * packageName    : stream.operation
 * fileName       : PrimitiveStreamMain
 * author         : mzc01-jungminim
 * date           : 2025. 5. 11.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 11.        mzc01-jungminim       최초 생성
 */
public class PrimitiveStreamMain {

    public static void main(String[] args) {
        // 기본형 특화 스트림 생성(IntStream, LongStream, DoubleStream)
        IntStream stream = IntStream.of(1,2,3,4,5);
        stream.forEach(i -> System.out.print(i+" "));
        System.out.println();

        // 범위로 생성
        IntStream range1 = IntStream.range(1,6); // [1,2,3,4,5] 끝 값 미만
        IntStream range2 = IntStream.rangeClosed(1,5); // [1,2,3,4,5] 끝 값 포함

        // 1. 통계 관련 메소드 (sum, average, max, min ,count)
        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);
        double asDouble = IntStream.range(1, 6).average().getAsDouble();
        System.out.println("asDouble = " + asDouble);

        IntSummaryStatistics stats = IntStream.range(1, 6).summaryStatistics();
        System.out.println("합계: " + stats.getSum());
        System.out.println("평균: " + stats.getAverage());
        System.out.println("최댓값: " + stats.getMax());
        System.out.println("최솟값: " + stats.getMin());
        System.out.println("개수: " + stats.getCount());

        // 2. 타입 변환 메서드
        // IntStream -> LongStream
        LongStream longStream = IntStream.range(1, 6).asLongStream();
        System.out.println("longStream = " + longStream);

        // IntStream -> DoubleStream
        DoubleStream doubleStream = IntStream.range(1, 6).asDoubleStream();
        System.out.println("doubleStream = " + doubleStream);

        // IntStream -> Stream<Integer>
        Stream<Integer> boxed = IntStream.range(1, 5).boxed();

        // 3. 기본현 특화 매핑
        // int -> long 변환 매핑
        LongStream longStream1 = IntStream.range(1, 5)
                .mapToLong(i -> i);
        // int -> double 변환 매핑
        DoubleStream mappedDouble = IntStream.range(1, 5)
                .mapToDouble(i -> i * 1.5);
        // int -> 객체 변환 매핑
        Stream<String> mappedObj = IntStream.range(1, 5)
                .mapToObj(i -> "Number: " + i);

        // 4. 객체 스트림 -> 기본형 특화 스트림
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        int sum1 = integerStream.mapToInt(i -> i)
                .sum();
        System.out.println("sum1 = " + sum1);


    }
}
