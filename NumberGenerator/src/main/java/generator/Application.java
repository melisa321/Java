package generator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// zadanie dodatkowe nr.2
// 1
////- napisz program generujacy tylko 10 pierwszych cyfr ktore sa wieksza niz 100, mnijesze niz 1000 i podzielne przez 5. A wyswietl
//  dane liczby pomnozone przez 3
//  (musiz napisac fk. ktora zwroci jakis zbior 10 cyfr i po wywolaniu jej wyswietlu to na konsoli)

// 2
// Utwórz strumień kolejnych liczb całkowitych zaczynając od 0. Następnie korzystając z metody filter()
// wybierz tylko te z nich, które są większe od 100, mniejsze od 1000 i podzielne przez 5.
// Wyświetl na ekranie pierwszych 10 liczb tego strumienia pomnożonych przez 3
// Nie wykorzystuj w programie ani jednej pętli. streams!

public class Application {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator(new Random());
        numberGenerator.find10RandomNumbersGraterThan10AndLowerThan1000();
        //numberGenerator.fk2(100, 1000);
        //StreamGenerator streamGenerator = new StreamGenerator();
//        streamGenerator.generateNumbersUsingStreams();
    }
}
