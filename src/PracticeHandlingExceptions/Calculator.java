package PracticeHandlingExceptions;
public class Calculator {
    public static int factorial(int num) {
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        if (num < 0) {
            throw new IllegalArgumentException("Invalid parameter. Make sure parameter is 0 or greater.");
        }

        return answer;
    }


    public static int binomialCoefficient(int setSize, int subsetSize) {

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);
        if (setSize < 0 || subsetSize < 0 || subsetSize> setSize) {
            throw new IllegalArgumentException("Invalid parameters. Make sure parameters are non-negative and the subsetSize does not exceed the setSize.");
        }

        return numerator / denominator;
    }

}
