import org.junit.jupiter.api.Test;
import org.sandbox.streamsExo.StreamsExercise;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StreamsExerciseTest {
    @Test
    public void testFilterNamesStartingWith() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave", "Eva");

        StreamsExercise streamsExercise = new StreamsExercise();
        List<String> filteredNames = streamsExercise.filterNamesStartingWith(names, 'c');

        assertEquals(1, filteredNames.size());
        assertTrue(filteredNames.contains("Charlie"));
    }

    @Test
    public void testConcatenateStrings() {
        List<String> strings = Arrays.asList("Hello", " ", "world", "!");

        StreamsExercise streamsExercise = new StreamsExercise();
        String concatenatedString = streamsExercise.concatenateStrings(strings);

        assertEquals("Hello world!", concatenatedString);
    }

    @Test
    public void testSumNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        StreamsExercise streamsExercise = new StreamsExercise();
        int sum = streamsExercise.sumNumbers(numbers);

        assertEquals(15, sum);
    }

    @Test
    public void testRemoveDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        StreamsExercise streamsExercise = new StreamsExercise();
        List<Integer> distinctNumbers = streamsExercise.removeDuplicates(numbers);

        assertEquals(5, distinctNumbers.size());

    }

    @Test
    public void testConvertToUppercase() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        StreamsExercise streamsExercise = new StreamsExercise();
        List<String> uppercaseStrings = streamsExercise.convertToUppercase(strings);

        assertEquals(3, uppercaseStrings.size());
        assertTrue(uppercaseStrings.contains("APPLE"));
        assertTrue(uppercaseStrings.contains("BANANA"));
        assertTrue(uppercaseStrings.contains("CHERRY"));
    }
}
