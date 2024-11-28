package kata.kyu8;

public class StringCleaning {
    static String stringClean(final String text) {
        return text.replaceAll("[\\d]", "");
    }
}
