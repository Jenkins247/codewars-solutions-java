package kata.kyu8;

/**
 * Is the string uppercase?<p>
 * Task: Create a method to see whether the string is ALL CAPS.<p>
 * Examples (input -> output)<p>
 * "c" -> False<p>
 * "C" -> True<p>
 * "hello I AM DONALD" -> False<p>
 * "HELLO I AM DONALD" -> True<p>
 * "ACSKLDFJSgSKLDFJSKLDFJ" -> False<p>
 * "ACSKLDFJSGSKLDFJSKLDFJ" -> True<p>
 * In this Kata, a string is said to be in ALL CAPS whenever it does not contain any lowercase letter
 * so any string containing no letters at all is trivially considered to be in ALL CAPS.
 */
public class StringUppercase {
    public static boolean isUpperCase(String s) {
        s = s.replaceAll("\\W+","");
        return s.contentEquals(String.format(s).toUpperCase());
    }
}
