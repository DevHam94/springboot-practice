import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitQuiz {
    @Test
    public void junitTest() {
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        // 1. 모든 변수가 null이 아닌지 확인
        Assertions.assertThat(name1).isNull();
        Assertions.assertThat(name2).isNull();
        Assertions.assertThat(name3).isNull();

        // 2. name1과 name2가 같은지 확인
        Assertions.assertThat(name1).isEqualTo(name2);

        // 3. name1과 name3가 다른지 확인
        Assertions.assertThat(name1).isNotEqualTo(name3);
    }

    @Test
    public void junitTest2() {
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

        // 1. number1은 양수인지 확인
        Assertions.assertThat(number1).isPositive();
        // 2. number2은 0인지 확인
        Assertions.assertThat(number2).isZero();
        // 3. number3은 음수인지 확인
        Assertions.assertThat(number3).isNegative();
        // 4. number1은 number2보다 큰지 확인
        Assertions.assertThat(number1).isGreaterThan(number2);
        // 5. number3은 number2보다 작은지 확인
        Assertions.assertThat(number3).isLessThan(number2);
    }
}
