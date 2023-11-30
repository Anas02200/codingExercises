package org.sandbox.collectionsExercise;

import java.util.*;



//the first comment under each method indicates what to implement ,
//the comments after that are an implementation example
public class CollectionsExercise {

    public List<String> sortStrings(List<String> strings) {
        // Implement sorting strings in ascending order
//        Collections.sort(strings);
        return strings;
    }

    public Set<Integer> removeDuplicatesFromList(List<Integer> numbers) {
        // Implement removing duplicates from the list and returning a set
         //new HashSet<>(numbers);
        return new HashSet<>();
    }

    public Map<String, Integer> countOccurrences(List<String> strings) {
        // Implement counting occurrences of strings in the list
        Map<String, Integer> occurrences = new HashMap<>();
//        for (String str : strings) {
//            occurrences.put(str, occurrences.getOrDefault(str, 0) + 1);
//        }
        return occurrences;
    }

    public Queue<String> createQueue(List<String> elements) {
        // Implement creating a queue from elements in the list
        //return new LinkedList<>(elements);
        return new LinkedList<>();
    }

    public void addToMap(Map<String, Integer> map, String key, int value) {
        // Implement adding a key-value pair to the map
       // map.put(key, value);
    }
}
