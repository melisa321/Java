package linechanger.reader;

import java.util.Scanner;
//public methods?

public class Reader {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readChangeString() {
        System.out.println("Chcesz zamienić na małe (lower), czy wielkie litery (upper)?");
        return scanner.nextLine();
    }

    public static String[] readWords(int size) {
        String[] result = new String[ size ];
        for (int i = 0; i < result.length; i++) {
            System.out.println("Podaj wyraz numer " + (i + 1));
            result[ i ] = scanner.nextLine();
        }
        return result;
    }

    public static int getNumberOfWords() {
        System.out.println("Ile wyrazów chcesz wczytać?");
        return Integer.valueOf(scanner.nextLine());
    }

}
