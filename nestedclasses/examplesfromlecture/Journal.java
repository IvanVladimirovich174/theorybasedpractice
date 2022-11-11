package nestedclasses.examplesfromlecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Journal {
    private List<User> students = new ArrayList<>();

    public void add(User user) {
        students.add(user);
    }

    public Iterator<User> getUserIterator() {
        return new JournalIterator();
    }

    // Inner class
    public class JournalIterator implements Iterator<User> {
        private int position;

        public JournalIterator() {
            position = 0;
        }

        @Override
        public boolean hasNext() {
           if (position < students.size()) {
               return true;
           } else {
               return false;
           }
        }

        @Override
        public User next() {
            User user = students.get(position);
            position = position + 1;
            return user;
        }
    }
}
