package nestedclasses.notes;

import java.util.List;
import java.util.function.Function;

class MySomeClass {
    // Static class
    public static class MyStaticClass {
    }

    // Inner class
    public class MyInnerClass {
    }

    // Local class
    public void fooLocal() {
        class MyLocalClass {
            public void doSmth() {
                System.out.println("My local class");
            }
        }

        MyLocalClass myLocalClass = new MyLocalClass();
        myLocalClass.doSmth();
    }

    // Anonymous class
    public void fooAnonymous() {
        Function<String,Integer> anonymousClass = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        List<String> list = List.of("A","AA","AAA","AAAA");
        list.stream().map(anonymousClass).forEach(System.out::println);
    }
}
