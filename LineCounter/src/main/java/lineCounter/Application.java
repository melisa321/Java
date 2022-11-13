package lineCounter;

public class Application {
    public static void main(String[] args) {
        LineCounter.sumLineNumbersInDirectory();
        LineCounterSingleFile.sumLineNumbersInFile();
    }
}
