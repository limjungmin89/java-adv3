package lambda;

/**
 * packageName    : lambda
 * fileName       : LambdaTest8
 * author         : mzc01-jungminim
 * date           : 2025. 5. 8.
 * description    : 함수를 반환하는 메소드 만들기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 8.        mzc01-jungminim       최초 생성
 */
public class LambdaTest8 {

    public static void main(String[] args) {
        StringFunction func = buildGreeter("My Name is");
        System.out.println("func.apply(\"Jungmin Lim\") = " + func.apply("Jungmin Lim"));
    }

    static StringFunction buildGreeter(String greeting) {
        return (str) -> "Hello " + greeting + " " + str;
    }
}
