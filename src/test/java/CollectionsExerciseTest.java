import org.junit.jupiter.api.Test;
import org.sandbox.collectionsExercise.CollectionsExercise;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionsExerciseTest {
    @Test
    public void testSortStrings() {
        List<String> strings = Arrays.asList("Apple", "Orange", "Banana", "Grape");

        CollectionsExercise collectionsExercise = new CollectionsExercise();
        List<String> sortedStrings = collectionsExercise.sortStrings(strings);

        assertEquals("Apple", sortedStrings.get(0));
        assertEquals("Banana", sortedStrings.get(1));
        assertEquals("Grape", sortedStrings.get(2));
        assertEquals("Orange", sortedStrings.get(3));
    }

    @Test
    public void testRemoveDuplicatesFromList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5);

        CollectionsExercise collectionsExercise = new CollectionsExercise();
        Set<Integer> uniqueNumbers = collectionsExercise.removeDuplicatesFromList(numbers);

        assertEquals(5, uniqueNumbers.size());
    }

    @Test
    public void testCountOccurrences() {
        List<String> strings = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana", "Apple");

        CollectionsExercise collectionsExercise = new CollectionsExercise();
        Map<String, Integer> occurrences = collectionsExercise.countOccurrences(strings);

        assertEquals(3, occurrences.get("Apple"));
        assertEquals(2, occurrences.get("Banana"));
        assertEquals(1, occurrences.get("Orange"));
    }

    @Test
    public void testCreateQueue() {
        List<String> elements = Arrays.asList("A", "B", "C", "D");

        CollectionsExercise collectionsExercise = new CollectionsExercise();
        Queue<String> queue = collectionsExercise.createQueue(elements);

        assertEquals("A", queue.poll());
        assertEquals("B", queue.poll());
        assertEquals("C", queue.poll());
        assertEquals("D", queue.poll());
    }

    @Test
    public void testAddToMap() {
        Map<String, Integer> map = new HashMap<>();
        String key = "Key";
        int value = 10;

        CollectionsExercise collectionsExercise = new CollectionsExercise();
        collectionsExercise.addToMap(map, key, value);

        assertTrue(map.containsKey(key));
        assertEquals(value, map.get(key));
    }
}
