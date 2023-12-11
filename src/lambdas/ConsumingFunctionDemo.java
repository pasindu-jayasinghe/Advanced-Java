package lambdas;

import java.util.function.Function;

public class ConsumingFunctionDemo {
    public static void show() {
        Function<String, String> replaceColon = s -> s.replace(":", "=");
        Function<String, String> addBraces = s -> "{" + s + "}";
      // var result = replaceColon.andThen(addBraces).apply("key:value");

      var result = addBraces.compose(replaceColon).apply("key:value");
        System.out.println(result);
    }
}
