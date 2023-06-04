public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayListFirst = new MyArrayList();
        MyArrayList myArrayListSecond = new MyArrayList(10);

        System.out.println(myArrayListFirst.size());
        System.out.println(myArrayListSecond.size());
        System.out.println();

        System.out.println(myArrayListFirst.get(0));
        System.out.println(myArrayListSecond.get(0));
        System.out.println();

        myArrayListFirst.add(10);
        myArrayListSecond.add(10);

        System.out.println(myArrayListFirst.size());
        System.out.println(myArrayListSecond.size());
        System.out.println();

        System.out.println(myArrayListFirst.get(0));
        System.out.println(myArrayListSecond.get(0));
        System.out.println();
    }
}