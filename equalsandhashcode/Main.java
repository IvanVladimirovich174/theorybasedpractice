package equalsandhashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ivan174", "Ivan", "Chelyabinsk");
        User user2 = new User("Ivan174", "Ivan", "Chelyabinsk");
        User user3 = new User("JamesGosling", "James", "Calgary");

        // True
        boolean equalsValue = user1.equals(user2);
        System.out.println("EqualsValue = " + equalsValue);
        System.out.println("User1 hashCode = " + user1.hashCode());
        System.out.println("User2 hashCode = " + user2.hashCode());
        System.out.println();

        // False
        equalsValue = user1.equals(user3);
        System.out.println("EqualsValue = " + equalsValue);
        System.out.println("User1 hashCode = " + user1.hashCode());
        System.out.println("User3 hashCode = " + user3.hashCode());
        System.out.println();

        // Contains method uses equals method
        List<User> listUsers = new ArrayList<>();
        listUsers.add(user1);
        listUsers.add(user2);

        System.out.println("Is ListUsers contain user3 ?");
        System.out.println(listUsers.contains(user3));
    }
}
