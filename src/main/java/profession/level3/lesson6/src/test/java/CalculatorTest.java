import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;
    private static final Logger LOG = LogManager.getLogger(CalculatorTest.class.getName());

    @BeforeAll
    static void init(){
        calculator = new Calculator();
        LOG.info("Перед всеми");
    }

    private static Stream<Arguments> dataForSubOperation() {
        List<Arguments> out = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double a = random.nextDouble();
            double b = random.nextDouble();
            double result = a - b;
            out.add(Arguments.arguments(a, b, result));
        }
        return out.stream();
    }

    @BeforeEach
    void beforeEach(){
        LOG.info("Перед каждым");
    }

    @AfterEach
    void afterEach(){
        LOG.info("После каждого");
    }

    @AfterAll
    static void afterAll(){
        LOG.info("После всех");
    }


    @CsvSource({
            "1.0, -2.0, -1.0",
            "1, 1, 2",
            "2, 6, 8",
            "0.1, 0.1, 0.2",
    })
    @ParameterizedTest
    void add(double a, double b, double result) {
        Assertions.assertEquals(result, calculator.add(a, b));
    }

    @ParameterizedTest
    @MethodSource("dataForSubOperation")
    void sub(double a, double b, double result) {
        Assertions.assertEquals(result, calculator.sub(a, b));
    }

    @Test
    void mul() {
        double a = 3;
        double b = 2;
        Assertions.assertEquals(6, calculator.mul(a, b));
    }

    @Test
    void div() {
        double a = 6;
        double b = 2;
        //Assertions.assertEquals(3, calculator.div(a, b));
        Assertions.assertThrows(RuntimeException.class , () -> calculator.div(-2, 3));
    }

    @Disabled
    void div_zero() {
        double a = 6;
        double b = 0;
        Assertions.assertEquals(Infinity, calculator.div(a, b));
    }
}