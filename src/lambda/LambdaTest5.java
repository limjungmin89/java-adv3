package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : lambda
 * fileName       : LambdaTest5
 * author         : mzc01-jungminim
 * date           : 2025. 5. 7.
 * description    : 조건(함수)을 인자로 받아, 리스트에서 필요한 요소만 추려내기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 7.        mzc01-jungminim       최초 생성
 */
public class LambdaTest5 {

//    public static void main(String[] args) {
//        List<Integer> array = List.of(-3, -2, -1, 1, 2, 3, 5);
//
//        // 짝수/홀수 나누기
//        filter(array, value -> Math.abs(value) % 2 == 0);
//    }
//
//    static void filter(List<Integer> list, MyPredicate predicate) {
//        List<Integer> evenArray = new ArrayList<>();
//        List<Integer> even2Array = new ArrayList<>();
//        for (int i : list) {
//            if(predicate.test(Math.abs(i))) {
//                evenArray.add(i);
//            } else {
//                even2Array.add(i);
//            }
//        }
//        System.out.println("원본 리스트: " + list);
//        System.out.println("음수만: " + even2Array);
//        System.out.println("짝수만: " + evenArray);
//    }

    public static void main(String[] args) {
        List<Integer> array = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: " + array);
        // 1. 음수(negative)만 뽑아내기
        // 코드 작성
        List<Integer> negatives = filter(array, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value < 0;
            }
        });
        System.out.println("negatives = " + negatives);
        List<Integer> negatives2 = filter(array,  value -> value < 0);
        System.out.println("negatives2 = " + negatives2);

        // 2. 짝수(even)만 뽑아내기
        List<Integer> evens = filter(array, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        });
        System.out.println("evens = " + evens);
        List<Integer> evens2 = filter(array, value -> value % 2 == 0);
        System.out.println("evens2 = " + evens2);

    }

    static List<Integer> filter(List<Integer> list, MyPredicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if(predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
