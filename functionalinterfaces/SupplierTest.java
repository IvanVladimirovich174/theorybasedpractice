package functionalinterfaces;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> supplierTest1 = new Supplier<>() {
            @Override
            public Integer get() {
                return 15;
            }
        };

        System.out.println(supplierTest1.get());

        Supplier<Integer> supplierTest2 = () -> 15;

        System.out.println(supplierTest2.get());

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ivan");
        nameList.add("Elena");
        nameList.add("Andrei");
        nameList.add("Nikita");
        nameList.add("Igor");

        Supplier<String> supplierTest3 = () -> {
            int value = (int) (Math.random() * nameList.size());
            return nameList.get(value);
        };

        System.out.println(supplierTest3.get());
    }
}