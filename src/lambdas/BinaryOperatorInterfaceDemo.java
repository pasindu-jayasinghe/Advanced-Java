package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorInterfaceDemo {
    public static void show(){
        BinaryOperator<Integer> add = (a,b) -> a + b;
        Function<Integer,Integer> square = a -> a * a;
        var result = add.andThen(square).apply(1,2);
        System.out.println(result);


    }
}
