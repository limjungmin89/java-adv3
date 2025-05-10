package stream.operation;

import java.util.Optional;

/**
 * packageName    : stream.operation
 * fileName       : OptionalSimpleMain
 * author         : mzc01-jungminim
 * date           : 2025. 5. 10.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 10.        mzc01-jungminim       최초 생성
 */
public class OptionalSimpleMain {
    public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.of(10);
        System.out.println("optional1 = " + optional1);

        if(optional1.isPresent()) { // 값이 있는지 확인 할 수 있는 안전한 메서드
            Integer i = optional1.get();
            System.out.println("i = " + i);
        }

        Optional<Object> optional2 = Optional.of(null);
        System.out.println("optional2 = " + optional2);
        if(optional2.isPresent()) {
            Object o = optional2.get();
            System.out.println("o = " + o);
        }

        Object o2 = optional2.get();
        System.out.println("o2 = " + o2);
    }
}
