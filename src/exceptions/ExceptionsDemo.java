package exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void main(String[] args) {
        try(var reader = new FileReader("file.txt");
            var writer = new FileWriter("....");
        ) {

            var value = reader.read();
            new SimpleDateFormat().parse("");
        }catch (IOException | ParseException e) {
            System.out.println("Could not read data");
        }
//        finally { // when use try with resource statements no need final block
//            reader.close();
//        }
    }


}
