import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;

@Log
public class Calculator {

    public static double sum(double[] array) {

        log.info("Method 'sum'");
        double answer = 0;
        for (double a : array) {
            answer += a;
        }
        return answer;
    }

    public static double mul(double x, double y) {
        log.info("Method 'mul'");
        return x * y;
    }

    public static double div(double x, double y) {
        log.info("Method 'div'");
        if (y != 0) {
            return x / y;
        } else {
            log.log(Level.SEVERE, "Division by zero");
            throw new ArithmeticException("Can't divide by zero");
        }
    }

    public static double sub(double x, double y) {
        log.info("Method 'sub'");
        return x - y;
    }
}