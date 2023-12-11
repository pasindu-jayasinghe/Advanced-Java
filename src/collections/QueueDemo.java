package collections;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        var front = queue.peek();//get the front item
        queue.remove();//remove the first
        var front1 = queue.poll();// return Null when q is empty
        System.out.println(front1);



    }
}
