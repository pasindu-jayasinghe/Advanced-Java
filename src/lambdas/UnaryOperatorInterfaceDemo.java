package lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceDemo {
    public static void show(){

        UnaryOperator<Integer> square = a -> a * a;
        UnaryOperator<Integer> increment = n -> n + 1;

        var res = increment.andThen(square).apply(1);
        System.out.println(res);

    }
}
