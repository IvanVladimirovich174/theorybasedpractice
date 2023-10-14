package collections.map.collision;

import java.util.HashMap;
import java.util.Map;

public class TestInvokeCollision {
    public static void main(String[] args) {
        User user1 = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);
        User user5 = new User(5);

        // ((HashMap.Node[]) ((HashMap) map).table)).
        Map<User, String> map = new HashMap<>();

        map.put(user1, "user1");
        map.put(user2, "user2");
        map.put(user3, "user3");
        map.put(user4, "user4");
        map.put(user5, "user5");
    }
}