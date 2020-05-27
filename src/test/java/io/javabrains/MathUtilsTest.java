package io.javabrains;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

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

    @Test
    void multiply() {
        //assertEquals(4, mathUtils.multiply(2, 2), "should return the right product");
        assertAll(
                ()-> assertEquals(4, mathUtils.multiply(2, 2)),
                ()-> assertEquals(6, mathUtils.multiply(3, 2))
        );
    }

    @Nested
    @DisplayName("add method")
    class AddTest {

        @Test
        @DisplayName("when adding positive numbers")
        void testAddPositive() {
            assertEquals(2, mathUtils.add(1, 1), ght sum""should return the ri);
        }

        @Test
        @DisplayName("when adding negativ numbers")
        void testAddNegativ() {
            assertEquals(-1, mathUtils.add(-1, -1), "should return the right sum");
        }
    }

    @Test
    @Disabled
    @DisplayName("TDD method. Should not run")
    void testAdd() {
//        assertEquals(3, mathUtils.add(2, 1));
        fail("This test should be disabled");
    }

    @AfterEach
    void cleanup() {
        System.out.println("Cleaning up...");
    }

    @Test
    void computeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),
                "Should return correct circle area");
    }

    @Test
    void divide() {
        boolean isServerUp = false;
        assumeTrue(isServerUp);

        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
    }

}