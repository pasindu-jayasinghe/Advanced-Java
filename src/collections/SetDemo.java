package collections;

import java.util.*;

public class SetDemo {
    public static void show(){
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection,"a","b","c","c");
        Set<String> set1 = new HashSet<>(collection);
        System.out.println(set1);

        Set<String> setA = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> setB = new HashSet<>(Arrays.asList("b","c","d"));

        //Union
        //setA.addAll(setB);
        //System.out.println("Union-" + setA);

        //Intersection
        //setA.retainAll(setB);
        //System.out.println("Intersection"+ setA);

        //Difference
        setA.removeAll(setB);
        System.out.println("Difference"+ setA);




    }
}
