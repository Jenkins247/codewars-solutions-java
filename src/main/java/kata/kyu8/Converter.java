package kata.kyu8;
/**
 * Sometimes, I want to quickly be able to convert miles per imperial gallon (mpg) into kilometers per liter (kpl).
<p>
 * Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).
 * Make sure to round off the result to two decimal points.
 * Some useful associations relevant to this kata:
 <p>
 * 1 Imperial Gallon = 4.54609188 litres
 <p>
 * 1 Mile = 1.609344 kilometres
 */

public class Converter {
    private static final float LITRES_IN_GALLON = 4.54609188f;
    private static final float KILOMETERS_IN_MILES = 1.609344f;

    public static float mpgToKPM(final float mpg) {
        float result = mpg * KILOMETERS_IN_MILES / LITRES_IN_GALLON;
        return Double.valueOf(Math.round(result / 0.01f) * 0.01f).floatValue();
    }
}
