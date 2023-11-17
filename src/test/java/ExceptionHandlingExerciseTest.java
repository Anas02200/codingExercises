import org.junit.jupiter.api.Test;
import org.sandbox.ExceptionsExo.CustomException;
import org.sandbox.ExceptionsExo.ExceptionHandlingExercise;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingExerciseTest {

    @Test
    public void testDivideNumbers() {
        ExceptionHandlingExercise exercise = new ExceptionHandlingExercise();

        int result = exercise.divideNumbers(10, 2);
        assertEquals(5, result);

        int zeroDivision = exercise.divideNumbers(8, 0);
        assertEquals(0, zeroDivision); // Expecting default value due to exception
    }

    @Test
    public void testAccessArrayElement() {
        ExceptionHandlingExercise exercise = new ExceptionHandlingExercise();
        String[] array = {"A", "B", "C"};

        String element = exercise.accessArrayElement(array, 1);
        assertEquals("B", element);

        String outOfBounds = exercise.accessArrayElement(array, 5);
        assertEquals("", outOfBounds); // Expecting default value due to exception
    }

    @Test
    public void testHandleCustomException_PositiveNumber() {
        ExceptionHandlingExercise exercise = new ExceptionHandlingExercise();

        try {
            exercise.handleCustomException(10);
        } catch (CustomException e) {
            fail("Should not throw an exception for positive numbers");
        }
    }

    @Test
    public void testHandleCustomException_NegativeNumber() {
        ExceptionHandlingExercise exercise = new ExceptionHandlingExercise();

        assertThrows(CustomException.class, () -> exercise.handleCustomException(-5));
    }
}