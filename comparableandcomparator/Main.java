package comparableandcomparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        // CompareTo
        users.add(new User("Ivan", 31, "MoScow"));
        users.add(new User("Sergey", 29, "mOScow"));
        users.add(new User("James", 27, "Calgary"));
        System.out.println("list = " + users);

        users.sort(User::compareTo);

        System.out.println("List after sort = " + users);

        // Clear
        users.clear();

        // Comparator
        users.add(new User("Ivan", 31, "Amsterdam"));
        users.add(new User("Sergey", 29, "Moscow"));
        users.add(new User("James", 27, "Calgary"));
        System.out.println("list = " + users);

        Comparator<User> cmpByAge = new UserByAgeComparator();
        users.sort(cmpByAge);
        System.out.println("List after sort = " + users);

        Comparator<User> cmpByCity = new UserByCityComparator();
        users.sort(cmpByCity);
        System.out.println("List after sort = " + users);
    }
}