package generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    private static final int MIN_VALUE = 100;
    private static final int MAX_VALUE = 1000;
    private static final int MAX_NUMBER_OF_FOUNDED_RANDOM_NUMBERS = 10;

    private final Random random;

    public NumberGenerator(Random random) {
        this.random = random;
    }

    public List<Integer> find10RandomNumbersGraterThan10AndLowerThan1000() {
        List<Integer> numbersList = new ArrayList<>();
        do {
            int randomNumber = MIN_VALUE + (random.nextInt() * (MAX_VALUE - MIN_VALUE + 1));
            if (idDividedBy5(randomNumber)) {
                numbersList.add(randomNumber * 3);
            }
        } while (numbersList.size() < MAX_NUMBER_OF_FOUNDED_RANDOM_NUMBERS);
        System.out.println(numbersList);
        return numbersList;
    }

    public List<Integer> fk2(int minValue, int maxValue) {
        List<Integer> result = new LinkedList<>();
        for (int i = minValue; i <= maxValue; i++) {
            if (idDividedBy5(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public List<Integer> fk3(int minVaue, int maxValue) {
        List<Integer> result = new LinkedList<>();
        for (Integer number : fk2(minVaue, maxValue)) {
            result.add(number * 3);
        }

        return result;
    }

    private boolean idDividedBy5(int number) {
        return number % 5 == 0;
    }

}
