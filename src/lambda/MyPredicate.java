package lambda;

/**
 * packageName    : lambda
 * fileName       : MyPredicate
 * author         : mzc01-jungminim
 * date           : 2025. 5. 7.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 7.        mzc01-jungminim       최초 생성
 */
@FunctionalInterface
public interface MyPredicate {
    boolean test(int value);
}
