package kata.kyu8;

import java.util.regex.Pattern;

/**
 * You received a whatsup message from an unknown number. Could it be from that girl/boy with a foreign accent you met yesterday evening?
 * <p>Write a simple function to check if the string contains the word hallo in different languages.
 *
 * <p>These are the languages of the possible people you met the night before:
 *
 * <li>hello - english
 * <li>ciao - italian
 * <li>salut - french
 * <li>hallo - german
 * <li>hola - spanish
 * <li>ahoj - czech republic
 * <li>czesc - polish
 * <p>
 * Notes:
 * <ul>you can assume the input is a string.
 * to keep this a beginner exercise you don't need to check if the greeting is a subset of word (Hallowen can pass the test)
 * function should be case insensitive to pass the tests</ul>
 */
public class DidSheSayHallo {

    public static boolean validateHello(String greetings) {
        String[] greetingsArr = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
        Pattern pattern;
        for (String word : greetingsArr) {
            pattern = Pattern.compile(word);
            if (pattern.matcher(greetings.toLowerCase()).find()) {
                return true;
            }
        }
        return false;
    }
}
