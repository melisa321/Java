package generator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumerGeneratorTest {
    @Test
    void validateIntegerNumbers1() {
        LinkedList expectedList = new LinkedList<>();
        expectedList.add(10);
        expectedList.add(15);

        NumberGenerator numberGenerator = new NumberGenerator(new Random());
        List<Integer> actualList = numberGenerator.fk2(10, 15);

        Assertions.assertEquals(expectedList.get(0), actualList.get(0));
        Assertions.assertEquals(expectedList.get(1), actualList.get(1));
    }

    @Test
    void validateIntegerMinusNumbers2() {
        LinkedList expectedList = new LinkedList<>();
        expectedList.add(-15);
        expectedList.add(-10);

        NumberGenerator numberGenerator = new NumberGenerator(new Random());
        List<Integer> actualList = numberGenerator.fk2(-15, -10);

        Assertions.assertEquals(expectedList.get(0), actualList.get(0));
        Assertions.assertEquals(expectedList.get(1), actualList.get(1));
    }

    @Test
    void validateNullIntegerNumbers3() {
        List<Integer> expectedList = new LinkedList<>();
        expectedList.add(0);
        expectedList.add(5);

        NumberGenerator numberGenerator = new NumberGenerator(new Random());
        List<Integer> actualList = numberGenerator.fk2(0, 5);

        assertEquals(expectedList, actualList);
    }

    @Test
    void validateZeroIntegerNumbers4() {
        List<Integer> expectedList = new LinkedList<>();
        expectedList.add(0);

        NumberGenerator numberGenerator = new NumberGenerator(new Random());
        List<Integer> actualList = numberGenerator.fk2(0, 1);

        Assertions.assertEquals(expectedList.size(), actualList.size());
        Assertions.assertEquals(expectedList.get(0), actualList.get(0));
    }

    @Test
    void validateLastIntegerNumbers5() {
        List<Integer> expectedList = Arrays.asList(-5, 0, 5, 10, 15, 20);

        NumberGenerator numberGenerator = new NumberGenerator(new Random());
        List<Integer> actualList = numberGenerator.fk2(-5, 20);

        assertEquals(expectedList, actualList);
    }

    @Test
    void validateIntegerMaxNumbers6() {
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(-5);
        expectedList.add(5);

        NumberGenerator numberGenerator = new NumberGenerator(new Random());
        List<Integer> actualList = numberGenerator.fk2(-5, 5);

        Assertions.assertEquals(expectedList.get(0), actualList.get(0));
        Assertions.assertEquals(expectedList.get(1), actualList.get(1));
    }

    @Test
    void validateFind10RandomNumbersGraterThan10AndLowerThan1000() {
        List<Integer> oczekiwanyWynikTestu = Arrays.asList(13815, 27330, 40845, 54360, 54360, 54360, 54360, 54360, 54360, 54360);

        Random randomMock = Mockito.mock(Random.class);
        Mockito.when(randomMock.nextInt())
                .thenReturn(5)
                .thenReturn(10)
                .thenReturn(15)
                .thenReturn(20);

        NumberGenerator numberGenerator = new NumberGenerator(randomMock);
        List<Integer> wynikTestu = numberGenerator.find10RandomNumbersGraterThan10AndLowerThan1000();

        Assertions.assertEquals(oczekiwanyWynikTestu, wynikTestu);
    }


}