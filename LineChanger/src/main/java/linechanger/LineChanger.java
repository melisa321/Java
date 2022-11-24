package linechanger;

import static linechanger.ChangeStringToLowerUpperCase.changeWordsToLowerCase;
import static linechanger.ChangeStringToLowerUpperCase.changeWordsToUpperCase;
import static linechanger.PrintStrings.printArray;
import static linechanger.reader.Reader.*;

class LineChanger {

    public void changeWords() {
        int numberOfWords = getNumberOfWords();
        String[] words = readWords(numberOfWords);
        String change = readChangeString();
        if (change.equals("upper")) {
            changeWordsToUpperCase(words);
        } else if (change.equals("lower")) {
            changeWordsToLowerCase(words);
        } else {
            System.out.println("Nieprawidłowy tekst, zostawiam oryginalny tekst");
        }

        printArray(words);
    }
}