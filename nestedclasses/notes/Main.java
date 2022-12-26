package nestedclasses.notes;

public class Main {
    public static void main(String[] args) {

        // Static nested class
        MySomeClass.MyStaticClass myStaticClass = new MySomeClass.MyStaticClass();

        //Non-static nested inner class
        MySomeClass mySomeClass1 = new MySomeClass();
        MySomeClass.MyInnerClass myInnerClass1 = mySomeClass1.new MyInnerClass();

        MySomeClass.MyInnerClass myInnerClass2 = new MySomeClass().new MyInnerClass();

        // Non-static nested local class
        mySomeClass1.fooLocal();

        //Non-static nested anonymous class
        mySomeClass1.fooAnonymous();
    }
}