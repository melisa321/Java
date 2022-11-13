package lineCounter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static lineCounter.consts.PathConsts.DIRECTORY_PATH;
import static lineCounter.consts.PathConsts.TXT_FILE_EXTENSION;

public class LineCounter {

    public static int sumLineNumbersInDirectory() {

        File directory = new File(DIRECTORY_PATH);
        //File[] files = directory.listFiles();
        final File[] files = new File(DIRECTORY_PATH).listFiles();
        //System.out.println("The number of files:" + files.length);
        int sumAllLinesFromFiles = 0;
        int sumOfLineNumbers = 0;

        if (DIRECTORY_PATH == null || DIRECTORY_PATH.isEmpty()) {
            return 0;
        }
        for (File file : files) {
            if (file.isFile() && file.getName().contains(TXT_FILE_EXTENSION)) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader((DIRECTORY_PATH) + "\\" + file.getName()));

                    while ((bufferedReader.readLine()) != null) {
                        sumOfLineNumbers++;
                    }
                } catch (NumberFormatException | IOException e) {
                    e.printStackTrace();
                }
            }
            //if (Files.isDirectory(Paths.get(DIRECTORY_PATH));
        }
        sumAllLinesFromFiles = +sumOfLineNumbers;
        System.out.println("The sum of all lines from files: " + sumAllLinesFromFiles);

        return sumAllLinesFromFiles;
    }
}

