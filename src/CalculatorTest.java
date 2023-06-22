import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class CalculatorTest {
    double[] array;
    double x;
    double y;

    @BeforeEach
    void prepareDate() {
        array = new double[]{3, 2, 5, 10};
        x = 10;
        y = 5;
    }

    @Test
    void testSum() {
        assertTimeout(
                Duration.ofMillis(100L), () -> {
        double answer = Calculator.sum(array);
        assertEquals(20, answer);
                }
        );
    }

    @Test
    void testMul() {
        assertTimeout(
                Duration.ofMillis(100L), () -> {

        double answer = Calculator.mul(x, y);
        assertEquals(50, answer);
                }
        );
    }

    @Test
    void testDivIfYNotNull() {
        assertTimeout(
                Duration.ofMillis(100L), () -> {

                    if (y != 0) {
                        double answer = Calculator.div(x, y);
                        assertEquals(2, answer);
                    }
                }
        );
    }


    @Test
    void testDivIfYNull() throws ArithmeticException {
        assertTimeout(
                Duration.ofMillis(100L), () -> {

                    Throwable exception = assertThrows(
                            ArithmeticException.class,
                            () -> {
                                Calculator.div(10, 0);
                            }
                    );

                    assertNotNull(exception.getMessage());
                }
        );
    }

    @Test
    void sub() {
            assertTimeout(
            Duration.ofMillis(100L),()->{
        double answer = Calculator.sub(x, y);
        assertEquals(5, answer);
            }
            );
    }
//    @Test
//    void verificationTest(){
//        Calculator newCalc = Mockito.mok(Calculator.class);
//    }
}