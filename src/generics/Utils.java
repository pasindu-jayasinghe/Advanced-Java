package generics;

import java.util.Objects;

public class Utils {

    public static <T extends Comparable<T>> T max(T first, T second){
        return (first.compareTo(second) < 0) ? second : first;
    }

    public static <K ,V> void print(K key, V value){ // can add multiple type parameters
        System.out.println(key + "=" + value);
    }

    public static void printUser(User user){
        System.out.println(user);
    }
    //class CAP#1
    public static void printUsers(GenericUserList<? extends User> users){// can pass anything with ? (wildcard)
       // User x =  users.get(1);  can not assign to User object //  becz dont know about Type (capture of ?)
       // Object x = users.get(1);
        User x =  users.get(1);
       //  users.add(); if you want to add we have to use 'super' keyword instead of 'extends'
        // if yoy want to read use 'extends'
    }
}
