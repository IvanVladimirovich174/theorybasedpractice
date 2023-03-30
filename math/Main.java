public class Main {
    public static void main(String[] args) {
        double a = 0.45;

        double ceil = Math.ceil(a);
        System.out.println(ceil);

        double round = Math.round(a);
        System.out.println(round);

        double floor = Math.round(a);
        System.out.println(floor);

        double rint = Math.rint(a);
        System.out.println(rint);

        int max = Math.max(1, 2);
        System.out.println(max);

        int min = Math.min(1, 2);
        System.out.println(min);

        double sin = Math.sin(Math.PI / 2);
        System.out.println(sin);
    }
}