package lambda;

/**
 * packageName    : lambda
 * fileName       : LambdaTest4
 * author         : mzc01-jungminim
 * date           : 2025. 5. 7.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 7.        mzc01-jungminim       최초 생성
 */
public class LambdaTest4 {

    static MyFunction getOperation(String operation) {

        if (operation == "add") {
            return (a, b) -> a + b;
        } else if (operation == "sub") {
            return (a, b) -> a - b;
        } else {
            return (a, b) -> 0;
        }
    }

    public static void main(String[] args) {
        MyFunction addFunction = getOperation("add");
        System.out.println("addFunction.apply(1, 2) = " + addFunction.apply(1, 2));
        MyFunction subFunction = getOperation("sub");
        System.out.println("subFunction.apply(1, 2) = " + subFunction.apply(1, 2));
        MyFunction xxxFunction = getOperation("xxx");
        System.out.println("xxxFunction.apply(1, 2) = " + xxxFunction.apply(1, 2));
    }
}
