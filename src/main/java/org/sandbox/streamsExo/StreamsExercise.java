package org.sandbox.streamsExo;

import java.util.List;
import java.util.stream.Collectors;



//the first comment under each method indicates what to implement ,
//the comments after that are an implementation example
public class StreamsExercise {
    public List<String> filterNamesStartingWith(List<String> names, char startingLetter) {
        // Implement filtering names that start with the given letter

//        List<String> collect = names.stream()
//                .filter(name -> name.toLowerCase().charAt(0) == Character.toLowerCase(startingLetter))
//                .collect(Collectors.toList());
        return  names;
    }

    public String concatenateStrings(List<String> strings) {
        // Implement concatenating all strings in the list into one string
        String collect = strings.stream()
                .collect(Collectors.joining());
        return "";
    }

    public int sumNumbers(List<Integer> numbers) {
        // Implement summing all numbers in the list
//        int sum = numbers.stream()
//                .mapToInt(Integer::intValue)
//                .sum();
        return 0;
    }

    public List<Integer> removeDuplicates(List<Integer> numbers) {
        // Implement removing duplicates from the list
//        List<Integer> collect = numbers.stream()
//                .distinct()
//                .collect(Collectors.toList());
        return numbers;
    }

    public List<String> convertToUppercase(List<String> strings) {
        // Implement converting all strings to uppercase
//        List<String> collect = strings.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
        return strings;
    }
}
