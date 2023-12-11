package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        java.util.Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b","c");

        java.util.Collection<String > other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(collection == other);
        System.out.println(collection.equals(other));
    }
}
