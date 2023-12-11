package lambdas;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void show(){
        Function<String, Integer> map = s -> s.length();
        var length = map.apply("sky");
        System.out.println(length);


    }
}
