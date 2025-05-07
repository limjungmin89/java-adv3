package lambda;

/**
 * packageName    : lambda
 * fileName       : LambdaTest9
 * author         : mzc01-jungminim
 * date           : 2025. 5. 8.
 * description    : 함수 합성**: 두 함수를 이어 붙여, 한 번에 변환 로직을 적용할 수 있는 새 함수를 만들기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 8.        mzc01-jungminim       최초 생성
 */
public class LambdaTest9 {
    public static void main(String[] args) {
//        MyTransformer f1 = new MyTransformer() {
//            @Override
//            public String transform(String s) {
//                return s.toUpperCase();
//            }
//        };
        MyTransformer f1 = s -> s.toUpperCase();

//        MyTransformer f2 = new MyTransformer() {
//            @Override
//            public String transform(String s) {
//                return "**" + s + "**";
//            }
//        };
        MyTransformer f2 = s -> "**" + s + "**";

        MyTransformer composeFunc = compose(f1, f2);
        System.out.println("composeFunc.transform(\"hello\") = " + composeFunc.transform("hello"));
    }

    static MyTransformer compose(MyTransformer f1, MyTransformer f2) {
//        return new MyTransformer() {
//            @Override
//            public String transform(String s) {
//                String f1Result = f1.transform(s);
//                return f2.transform(f1Result);
//            }
//        };
        return s -> {
            String f1Result = f1.transform(s);
            return f2.transform(f1Result);
        };
    };
}
