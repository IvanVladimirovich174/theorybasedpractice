package nestedclasses.examplesfromlecture;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();

        User firstUser = User.builder()
                .setId("1")
                .setFirstName("Ivan")
                .setLastName("Meshkov")
                .build();

        User secondUser = User.builder()
                .setId("2")
                .setFirstName("Sergey")
                .setLastName("Petrov")
                .build();

        journal.add(firstUser);
        journal.add(secondUser);

        Iterator<User> iterator = journal.getUserIterator();

        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println("User" + user);
        }

        // Anonymous class
        Runnable printUsers = new Runnable() {
            @Override
            public void run() {
                Iterator<User> iterator = journal.getUserIterator();

                while (iterator.hasNext()) {
                    User user = iterator.next();
                    System.out.println("User" + user);
                }
            }
        };
        printUsers.run();
    }
}
