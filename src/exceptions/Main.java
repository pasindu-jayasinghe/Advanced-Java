package exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            AccountDemo.show();
        } catch (Throwable e) {
            System.out.println("An expected error occurred");        }
    }
}
