package functionalinterfaces.methodexecutiontimer;

public class MethodExecutionTimer {
    public long executionTime = 0;

    public void measureTime(Runnable runnable) {
        Long startTime = System.nanoTime();
        runnable.run();
        executionTime += System.nanoTime() - startTime;
    }
}