package reflection.getsuperclass;

public class Main {
    public static void main(String[] args) {

        // Get super class of class D
        System.out.println("Super class of class D--> " + D.class.getSuperclass().getSimpleName());

        // Get D's class interfaces
        System.out.println("D's class interfaces");
        for (Class<?> cls : D.class.getInterfaces()) {
            System.out.println("\t" + cls.getSimpleName());
        }
    }
}
