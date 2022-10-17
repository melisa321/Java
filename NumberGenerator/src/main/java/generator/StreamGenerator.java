package generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamGenerator {
//rozne testy na liste
    public List<Integer> generateNumbersUsingStreamTest2(int minValue, int maxValue){
       return IntStream.rangeClosed(minValue, maxValue)
                .boxed()
                .filter(isDividedBy5())
                .filter(this::isDividedBy5ZwyklaFunkcja)
                .map(multiplayBy3())
                .collect(Collectors.toList());
    }

    private Function<Integer, Integer> multiplayBy3() {
        return num -> num * 3;
    }

    public List<Integer> generateNumbersUsingStreams(){
         List<Integer> foundedNumbers = IntStream.rangeClosed(1, 1000)
                .filter(num -> num > 100 && num < 1000)
                .boxed()
                .filter(isDividedBy5())
                //.filter( num -> isDividedBy5ZwyklaFunkcja(num)) to jest to samo co wyzej
                .collect(Collectors.toList());

         List<Integer> foundedNumbersMultiplyBy3 = foundedNumbers.stream()
                .map(multiplayBy3())
                .collect(Collectors.toList());

        return foundedNumbersMultiplyBy3;
    }

    private boolean isDividedBy5ZwyklaFunkcja(Integer num) {
        return num % 5 == 0;
    }

    private Predicate<Integer> isDividedBy5() {
        return num -> num % 5 == 0;
    }
}
