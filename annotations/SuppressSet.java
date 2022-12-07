package annotations;

import java.util.HashSet;
import java.util.Set;

public class SuppressSet {
    @SuppressWarnings({"rawtypes", "unchecked"})
    private static void suppressSet() {
        Set set = new HashSet();
        set.add(1);
        System.out.println(set.size());
    }
}