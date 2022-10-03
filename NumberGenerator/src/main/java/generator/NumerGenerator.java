package generator;

import java.util.ArrayList;
import java.util.List;

public class NumerGenerator {

    List<Integer> numbersList = new ArrayList<>();

    int minimumValue = 990;
    int maximumValue = 1000;
    int n = 5;

    public List<Integer> addRandomToList() {

        do {
            int randomNumber = (minimumValue) + (int) (Math.random() * (maximumValue - minimumValue + 1));
            if (randomNumber % 5 == 0) {
                numbersList.add(randomNumber);
            }
        } while (numbersList.size() < n);
        System.out.println(numbersList);
        return numbersList;
    }
}
