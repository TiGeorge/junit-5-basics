package io.javabrains;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    static void beforeAllInit() {
        System.out.println("Before all...");
    }

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanup() {
        System.out.println("Cleaning up...");
    }

    @Test
    void testAdd() {
        assertEquals(3, mathUtils.add(2, 1));
    }

    @Test
    void computeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),
                "Should return correct circle area");
    }

    @Test
    void divide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
    }

}