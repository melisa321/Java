package linechanger;

public class ChangeStringToLowerUpperCase {
    static void changeWordsToLowerCase(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[ i ] = words[ i ].toLowerCase();
        }
    }

    static void changeWordsToUpperCase(String[] words) {
        for (int i = 0; i < words.length; i++) {
            words[ i ] = words[ i ].toUpperCase();
        }
        /*for (String word : words) {
            final String s = word.toUpperCase();

        }*/
    }
}
