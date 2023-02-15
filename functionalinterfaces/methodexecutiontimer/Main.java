package functionalinterfaces.methodexecutiontimer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Classic method");
        MethodExecutionTimer methodExecutionTimer = new MethodExecutionTimer();

        methodExecutionTimer.measureTime(new SimpleSummator());
        System.out.println(methodExecutionTimer.executionTime);
    }
}