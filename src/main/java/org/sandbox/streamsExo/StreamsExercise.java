package org.sandbox.streamsExo;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsExercise {
    public List<String> filterNamesStartingWith(List<String> names, char startingLetter) {
        // Implement filtering names that start with the given letter
        return names.stream()
                .filter(name -> name.toLowerCase().charAt(0) == Character.toLowerCase(startingLetter))
                .collect(Collectors.toList());
    }

    public String concatenateStrings(List<String> strings) {
        // Implement concatenating all strings in the list into one string
        return strings.stream()
                .collect(Collectors.joining());
    }

    public int sumNumbers(List<Integer> numbers) {
        // Implement summing all numbers in the list
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public List<Integer> removeDuplicates(List<Integer> numbers) {
        // Implement removing duplicates from the list
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> convertToUppercase(List<String> strings) {
        // Implement converting all strings to uppercase
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
