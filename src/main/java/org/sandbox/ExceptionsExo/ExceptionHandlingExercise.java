package org.sandbox.ExceptionsExo;

public class ExceptionHandlingExercise {

    public int divideNumbers(int dividend, int divisor) {
        // Perform division and handle ArithmeticException if divisor is zero
        int result = 0;
        try {
            result = dividend / divisor;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
        }
        return result;
    }

    public String accessArrayElement(String[] array, int index) {
        // Access array element and handle ArrayIndexOutOfBoundsException
        String element = "";
        try {
            element = array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array Index Out Of Bounds Exception: " + e.getMessage());
        }
        return element;
    }

    public void handleCustomException(int number) throws CustomException {
        // Throw a custom exception if the number is negative
        if (number < 0) {
            throw new CustomException("Negative Number Exception: " + number);
        }
        System.out.println("Number is positive: " + number);
    }
}
