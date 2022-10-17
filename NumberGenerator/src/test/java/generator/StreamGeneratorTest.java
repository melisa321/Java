package generator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class StreamGeneratorTest {

    @Test
    void validateNumbersUsingStreams() {
        LinkedList expectedList = new LinkedList<>();
        expectedList.add(315);
        expectedList.add(330);
        StreamGenerator streamGenerator = new StreamGenerator();
        List<Integer> actualList = streamGenerator.generateNumbersUsingStreams();

        Assertions.assertEquals(expectedList.get(0), actualList.get(0));
        Assertions.assertEquals(expectedList.get(1), actualList.get(1));
    }

    @Test
    void validateMinusNumbers(){
        //List<Integer> foundedNumbers = IntStream.rangeClosed(-200, -1);
        LinkedList expectedList = new LinkedList<>();
        expectedList.add(-615);
        expectedList.add(-630);

        StreamGenerator streamGenerator = new StreamGenerator();
        List<Integer> actualList = streamGenerator.generateNumbersUsingStreams();

        //Assertions.assertEquals(expectedList.get(0), foundedNumbers.get(0));


    }

}