import org.junit.jupiter.api.Test;
import org.sandbox.stringsExo.StringDataTypesExercise;

import static org.junit.jupiter.api.Assertions.*;

public class StringDataTypesExerciseTest {

    @Test
    public void testFindMax() {
        int[] numbers = {5, 8, 2, 10, 3};

        StringDataTypesExercise exercise = new StringDataTypesExercise();
        int max = exercise.findMax(numbers);

        assertEquals(10, max);
    }

    @Test
    public void testCalculateAverage() {
        double[] numbers = {2.5, 3.0, 4.5, 2.0, 3.5};

        StringDataTypesExercise exercise = new StringDataTypesExercise();
        double average = exercise.calculateAverage(numbers);

        assertEquals(3.1, average, 0.01);
    }

    @Test
    public void testCheckPalindrome() {
        String palindrome = "Madam";
        String nonPalindrome = "Hello";

        StringDataTypesExercise exercise = new StringDataTypesExercise();

        assertTrue(exercise.checkPalindrome(palindrome));
        assertFalse(exercise.checkPalindrome(nonPalindrome));
    }

    @Test
    public void testSplitString() {
        String sentence = "Java,String,API,Exercise";
        String delimiter = ",";

        StringDataTypesExercise exercise = new StringDataTypesExercise();
        String[] result = exercise.splitString(sentence, delimiter);

        assertEquals(4, result.length);
        assertEquals("String", result[1]);
    }

    @Test
    public void testReplaceCharacters() {
        String sentence = "Hello, world!";
        char oldChar = 'o';
        char newChar = 'x';

        StringDataTypesExercise exercise = new StringDataTypesExercise();
        String replaced = exercise.replaceCharacters(sentence, oldChar, newChar);

        assertEquals("Hellx, wxrld!", replaced);
    }

    @Test
    public void testConcatenateStrings() {
        String[] strings = {"Hello", " ", "World"};

        StringDataTypesExercise exercise = new StringDataTypesExercise();
        String concatenated = exercise.concatenateStrings(strings);

        assertEquals("Hello World", concatenated);
    }

    @Test
    public void testCountOccurrences() {
        String sentence = "Java is a programming language and Java is widely used.";

        StringDataTypesExercise exercise = new StringDataTypesExercise();
        int count = exercise.countOccurrences(sentence, "Java");

        assertEquals(2, count);
    }

    @Test
    public void testReverseWords() {
        String sentence = "Java is fun";

        StringDataTypesExercise exercise = new StringDataTypesExercise();
        String reversed = exercise.reverseWords(sentence);

        assertEquals("fun is Java", reversed);
    }

    @Test
    public void testRemoveWhitespace() {
        String sentence = "Java is awesome!";

        StringDataTypesExercise exercise = new StringDataTypesExercise();
        String noWhitespace = exercise.removeWhitespace(sentence);

        assertEquals("Javaisawesome!", noWhitespace);
    }

    @Test
    public void testConvertToUpperCase() {
        String sentence = "Java is great";

        StringDataTypesExercise exercise = new StringDataTypesExercise();
        String upperCase = exercise.convertToUpperCase(sentence);

        assertEquals("JAVA IS GREAT", upperCase);
    }

    @Test
    public void testExtractSubstring() {
        String sentence = "Hello, World!";

        StringDataTypesExercise exercise = new StringDataTypesExercise();
        String extracted = exercise.extractSubstring(sentence, 7, 12);

        assertEquals("World", extracted);
    }
}