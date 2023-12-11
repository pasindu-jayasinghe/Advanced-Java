package lambdas;

public class LambdasDemo {
    public static void print(String message){}
    public LambdasDemo(String message){}

    public static void show(){
        String prefix = "-";
        great(message -> System.out.println(prefix+message));//Lambda Expression
        Printer printer = message -> System.out.println(message);


        /*--------Method Reference-------*/
        great(System.out::println);
        great(LambdasDemo::print);
        great(LambdasDemo::new);


        /*---------Anonymous Inner Class--------*/
        great(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
        /*-------------------------------------*/
    }

    private static void great(Printer printer){
        printer.print("Hello");
    }
}
