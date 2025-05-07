package lambda;

import java.util.Arrays;

/**
 * packageName    : com.spring_boot.lambda
 * fileName       : LambdaTest3
 * author         : mzc01-jungminim
 * date           : 2025. 5. 7.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 7.        mzc01-jungminim       최초 생성
 */
public class LambdaTest3 {

    public static void measure(Procedure p) {
        Long startNs = System.nanoTime();

        p.run();

        Long endNs = System.nanoTime();
        System.out.println("실행시간 : " + (endNs - startNs));
    }

    public static void main(String[] args) {

//        measure(new Procedure() {
//            @Override
//            public void run() {
//                int n = 100;
//                int sum = 0 ;
//                for (int i = 0; i < n; i++) {
//                    sum += n;
//                }
//                System.out.println("현재까지의 sum = " + sum);
//            }
//        });

        measure(() -> {
                int n = 100;
                int sum = 0 ;
                for (int i = 0; i < n; i++) {
                    sum += n;
                }
                System.out.println("현재까지의 sum = " + sum);
            });

//        measure(new Procedure() {
//            @Override
//            public void run() {
//                int[] arr = {1,3,20,10,5};
//                System.out.println("현재 array = " + Arrays.toString(arr));
//                Arrays.sort(arr);
//                System.out.println("현재 array = " + Arrays.toString(arr));
//            }
//        });

        measure(() -> {
            int[] arr = {1,3,20,10,5};
            System.out.println("현재 array = " + Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("현재 array = " + Arrays.toString(arr));
        });
    }
}
