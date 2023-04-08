public class Main {
    public static void main(String[] args) {
        double a = 0.45;

        // rounded up to the nearest whole number
        double ceil = Math.ceil(a);
        System.out.println(ceil);

        // rounded down to the nearest whole number
        double floor = Math.floor(a);
        System.out.println(floor);

        double round = Math.round(a);
        System.out.println(round);

        double rint = Math.rint(a);
        System.out.println(rint);

        int max = Math.max(1, 2);
        System.out.println(max);

        int min = Math.min(1, 2);
        System.out.println(min);

        double sin = Math.sin(Math.PI / 2);
        System.out.println(sin);

        double cos = Math.cos(Math.PI / 2);
        System.out.println(cos);

        double tng = Math.tan(Math.PI / 2);
        System.out.println(tng);
    }
}