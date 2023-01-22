package functionalinterfaces;

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
    }
}