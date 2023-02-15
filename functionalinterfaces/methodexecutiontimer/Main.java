package functionalinterfaces.methodexecutiontimer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Classical approach:");
        MethodExecutionTimer methodExecutionTimer1 = new MethodExecutionTimer();

        methodExecutionTimer1.measureTime(new SimpleSummator());
        System.out.println(methodExecutionTimer1.executionTime);
        System.out.println();

        System.out.println("Anonymous class based approach:");
        MethodExecutionTimer methodExecutionTimer2 = new MethodExecutionTimer();
        methodExecutionTimer2.measureTime(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 1; i < 1_000_000_000; ++i) {
                    sum += i;
                }

                System.out.println(sum);
            }
        });
        System.out.println(methodExecutionTimer2.executionTime);
        System.out.println();

        System.out.println("Lambda based approach:");
        MethodExecutionTimer methodExecutionTimer3 = new MethodExecutionTimer();
        methodExecutionTimer3.measureTime(() -> {
            long sum = 0;
            for (int i = 1; i < 1_000_000_000; ++i) {
                sum += i;
            }

            System.out.println(sum);
        });
        System.out.println(methodExecutionTimer3.executionTime);
        System.out.println();
    }
}