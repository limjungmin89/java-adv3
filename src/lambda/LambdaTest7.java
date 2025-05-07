package lambda;

import java.util.List;

/**
 * packageName    : lambda
 * fileName       : LambdaTest7
 * author         : mzc01-jungminim
 * date           : 2025. 5. 7.
 * description    : 누적 로직(함수)을 인자로 받아, 리스트의 모든 요소를 하나의 값으로 축약하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 7.        mzc01-jungminim       최초 생성
 */
public class LambdaTest7 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4);

//        int sum = reduce(list, 0, new MyReducer() {
//            @Override
//            public int reduce(int a, int b) {
//                return a + b;
//            }
//        });
        int sum = reduce(list, 0, (int a, int b) -> a + b);
        System.out.println("sum = " + sum);

//        int multipleBy = reduce(list, 1, new MyReducer() {
//            @Override
//            public int reduce(int a, int b) {
//                return a * b;
//            }
//        });
        int multipleBy = reduce(list, 1, (int a, int b) -> a * b);
        System.out.println("multipleBy = " + multipleBy);

    }
    static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        for (int i : list) {
            initial = reducer.reduce(initial, i);
        }
        return initial;
    }
}
