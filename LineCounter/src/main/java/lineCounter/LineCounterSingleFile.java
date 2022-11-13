package lineCounter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static lineCounter.consts.PathConsts.SINGLE_PATH;

public class LineCounterSingleFile {
    public static int sumLineNumbersInFile() {

        int sumOfLineNumbers = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(SINGLE_PATH)));
            while ((bufferedReader.readLine()) != null) {
                sumOfLineNumbers++;
            }
            System.out.println("The sum of lines in 1 file: " + sumOfLineNumbers);

        } catch (IOException | NumberFormatException excp) {
            System.out.println(excp.getMessage());
        }
        return sumOfLineNumbers;
    }
}
