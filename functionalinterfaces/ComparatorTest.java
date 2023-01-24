package functionalinterfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();

        listOfString.add("333");
        listOfString.add("11");
        listOfString.add("2");

        Comparator<String> comparator = (String lhs, String rhs) -> {
            int lhsSize = lhs.length();
            int rhsSize = rhs.length();

            if (lhsSize < rhsSize) {
                return -1;
            };

            if (rhsSize == lhsSize) {
                return 0;
            } else return 1;
        };

        listOfString.sort(comparator);
        System.out.println(listOfString);
    }
}