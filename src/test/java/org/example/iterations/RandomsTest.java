package org.example.iterations;

import org.junit.jupiter.api.*;

@DisplayName("Тест класса Randoms.")
class RandomsTest {
    private Randoms randoms;

    @BeforeEach
    void setUp() {
        randoms = new Randoms(90, 100);
    }

    @AfterEach
    void tearDown() {
        randoms = null;
    }

    @RepeatedTest(5)
    void iteratorHasNextAlwaysReturnTrue() {
        Assertions.assertTrue(randoms.iterator().hasNext());
    }
    @DisplayName("Тест: iterator.next() возвращает число в диапазоне 90-100 ")
    @RepeatedTest(5)
    void iteratorNextReturnNumbsInDiapason() {
        int number = randoms.iterator().next();
        Assertions.assertTrue(number >= 90 && number <= 100);
    }
}