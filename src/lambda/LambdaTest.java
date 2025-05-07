package lambda;

/**
 * packageName    : com.spring_boot.lambda
 * fileName       : LambdaTest
 * author         : mzc01-jungminim
 * date           : 2025. 5. 7.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 5. 7.        mzc01-jungminim       최초 생성
 */
public class LambdaTest {

    public static void greetMorning() {
        System.out.println("=== 시작 ===");
        System.out.println("Good Morning!");
        System.out.println("=== 끝 ===");
    }
    public static void greetAfternoon() {
        System.out.println("=== 시작 ===");
        System.out.println("Good Afternoon!");
        System.out.println("=== 끝 ===");
    }
    public static void greetEvening() {
        System.out.println("=== 시작 ===");
        System.out.println("Good Evening!");
        System.out.println("=== 끝 ===");
    }

    public static void greet(String date) {
        System.out.println("=== 시작 ===");
        System.out.println("Good " + date + "!");
        System.out.println("=== 끝 ===");
    }

    public static void main(String[] args) {
//        greetMorning();
//        greetAfternoon();
//        greetEvening();
        greet("Morning");
        greet("Afternoon");
        greet("Evening");
    }
}
