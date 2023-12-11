package collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        Collection<String> generalCollection = new ArrayList<>();
        Collections.addAll(generalCollection,"a","b","x");
        //collection does not have indexing but List have

        List<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b");
        list.set(0,"+1");
        list.remove(1);
        list.get(1);
        list.indexOf("b");
        list.subList(0,2);

    }
}
