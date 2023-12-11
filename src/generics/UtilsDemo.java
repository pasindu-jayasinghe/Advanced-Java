package generics;

public class UtilsDemo {
    public static void main(String[] args) {
       var max = Utils.max(1,2);
       var maxUser = Utils.max(new User(10), new User(20));

        System.out.println(max);
        System.out.println(maxUser);
        Utils.print(1,"10");

        User user = new Instructor(11);
        var instructors = new GenericUserList<Instructor>();
        Utils.printUsers(instructors);


    }
}
