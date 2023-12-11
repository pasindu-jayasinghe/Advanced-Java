package exceptions;

import java.io.IOException;

public class AccountDemo {
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
    }
}
