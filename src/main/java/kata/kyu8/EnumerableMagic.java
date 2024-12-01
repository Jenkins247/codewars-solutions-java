package kata.kyu8;

import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * Create a method all which takes two params:<p>
 *  - a sequence<p>
 *  - a function (function pointer in C)<p>
 * and returns true if the function in the params returns true for every element in the sequence. Otherwise,
 * it should return false. If the sequence is empty, it should return true, since technically nothing failed the test.<p>
 *
 * Example<p>
 * all((1, 2, 3, 4, 5), greater_than_9) -> false<p>
 * all((1, 2, 3, 4, 5), less_than_9)    -> True<p>
 */
public class EnumerableMagic {
    public static boolean all(int[] list, IntPredicate predicate){
        // REMINDER: a Predicate "p" is tested for argument "arg" using p.test(arg)
        return Arrays.stream(list).allMatch(predicate);
    }
}
