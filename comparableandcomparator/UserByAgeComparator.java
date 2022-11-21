package comparableandcomparator;

import java.util.Comparator;

public class UserByAgeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        }

        if (o1.getAge() < o2.getAge()) {
            return -1;
        } else {
            return 1;
        }
    }
}
