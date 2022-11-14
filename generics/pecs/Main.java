package generics.pecs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<A> collectionA = new ArrayList<>();
        List<B> collectionB = new ArrayList<>();

        collectionA.add(new A());
        collectionA.add(new A());

        collectionB.add(new B());
        collectionB.add(new B());

        // Producer Extends Consumer Super (PECS)
        List<? extends A> listUpperBound = collectionA;
        List<? super B> listBottomBound = collectionB;

        // listUpperBound.add(new A());    //AVOID
        A elementA = listUpperBound.get(0);

        listBottomBound.add(new B());
        // B elementB = listBottomBound.get(0);   //AVOID
    }
}
