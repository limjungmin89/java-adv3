package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName    : lambda
 * fileName       : LambdaTest6
 * author         : mzc01-jungminim
 * date           : 2025. 5. 7.
 * description    : 변환 로직(함수)을 인자로 받아, 리스트의 각 요소를 다른 형태로 바꾸기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 7.        mzc01-jungminim       최초 생성
 */
public class LambdaTest6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(true) {
            String input = in.nextLine();
            if(input.equals("out")) {
                in.close();
                break;
            } else {
                list.add(input);
            }
        }

//        List<String> upperList = map(list, new StringFunction() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        });
        List<String> upperList = map(list,  s -> s.toUpperCase());
        System.out.println("upperList = " + upperList);

//        List<String> specialList = map(list, new StringFunction() {
//            @Override
//            public String apply(String s) {
//                return "***" + s + "***";
//            }
//        });
        List<String> specialList = map(list, s -> "***" + s + "***");
        System.out.println("specialList = " + specialList);

    }

    static List<String> map(List<String> list, StringFunction func) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(func.apply(s));
        }
        return result;
    }
}
