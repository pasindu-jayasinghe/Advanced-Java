package lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {

    public static void show(){
        Predicate<String> isLongerThan5 = s -> s.length() > 5;
        var result = isLongerThan5.test("sky");
        System.out.println(result);

        Predicate<String> hastLeftBrace = s -> s.startsWith("{");
        Predicate<String> hasRightBrace = s -> s.endsWith("}");
        Predicate<String> hasLeftAndRightBraces = hastLeftBrace.and(hasRightBrace);
        var res = hasLeftAndRightBraces.test("{key val}");
        System.out.println(res);





    }
}
