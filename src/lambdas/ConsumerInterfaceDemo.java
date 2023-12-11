package lambdas;


import java.util.List;

public class ConsumerInterfaceDemo {

    public static void show(){
        List<Integer> list = List.of(1,2,3);

        //Imperative programming (for, if/else, switch/case)
        for(var item : list)
            System.out.println(item);

        //Declarative programming
        list.forEach(System.out::println);
    }
}
