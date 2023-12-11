package lambdas;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void show(){
        Supplier<Double> getRandom = () -> Math.random();
        var random = getRandom.get();
        System.out.println(random);
    }
}
