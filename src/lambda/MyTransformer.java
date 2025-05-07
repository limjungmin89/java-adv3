package lambda;

/**
 * packageName    : lambda
 * fileName       : MyTransformer
 * author         : mzc01-jungminim
 * date           : 2025. 5. 8.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 8.        mzc01-jungminim       최초 생성
 */
@FunctionalInterface
public interface MyTransformer {
    String transform(String s);
}
