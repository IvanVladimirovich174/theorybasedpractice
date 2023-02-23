package streamtest4;

import java.util.stream.IntStream;

public class Factorial {
    public static int factorial(int number) {
        return IntStream
                .rangeClosed(1, number)
                .reduce(1, (int firstNumber, int secondNumber) -> {
                    System.out.println(firstNumber + " " + secondNumber);
                    return firstNumber * secondNumber;
                });
    }
}