package org.sandbox.stringsExo;
import java.util.Arrays;



//the first comment under each method indicates what to implement ,
//the comments after that are an implementation example
public class StringDataTypesExercise {
    public int findMax(int[] numbers) {
        // Find and return the maximum number in the array
       // Arrays.sort(numbers);
        //int number = numbers[numbers.length - 1];
        return 0;
    }

    public double calculateAverage(double[] numbers) {
        // Calculate and return the average of numbers in the array
//        double sum = Arrays.stream(numbers).sum();
//        return sum / numbers.length;
        return 0d;
    }

    public boolean checkPalindrome(String word) {
        // Check if the given word is a palindrome and return true/false
//        String formattedWord = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
//        return formattedWord.equals(new StringBuilder(formattedWord).reverse().toString());

        return true;
    }

    public String[] splitString(String sentence, String delimiter) {
        // Split the sentence by the delimiter and return an array of strings
//        return sentence.split(delimiter);
        return null;
    }

    public String replaceCharacters(String sentence, char oldChar, char newChar) {
        // Replace all occurrences of oldChar with newChar in the sentence
//        return sentence.replace(oldChar, newChar);
        return "";
    }

    public String concatenateStrings(String[] strings) {
        // Concatenate all strings in the array and return the result
        StringBuilder result = new StringBuilder();
//        for (String str : strings) {
//            result.append(str);
//        }
//        return result.toString();
        return "";
    }

    public int countOccurrences(String sentence, String subString) {
        // Count and return the number of occurrences of subString in the sentence
//        int count = 0;
//        int lastIndex = 0;
//        while (lastIndex != -1) {
//            lastIndex = sentence.indexOf(subString, lastIndex);
//            if (lastIndex != -1) {
//                count++;
//                lastIndex += subString.length();
//            }
//        }
//        return count;

        return 0;
    }

    public String reverseWords(String sentence) {
        // Reverse the order of words in the sentence and return the result
//        String[] words = sentence.split(" ");
//        StringBuilder reversed = new StringBuilder();
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]).append(" ");
//        }
//        return reversed.toString().trim();

        return sentence;
    }

    public String removeWhitespace(String sentence) {
        // Remove all whitespaces in the sentence and return the result
//        return sentence.replaceAll("\\s", "");
        return sentence;
    }

    public String convertToUpperCase(String sentence) {
        // Convert all characters in the sentence to uppercase and return the result
//        return sentence.toUpperCase();
        return sentence;
    }

    public String extractSubstring(String sentence, int start, int end) {
        // Extract a substring from the sentence based on the start and end indices and return it
//        return sentence.substring(start, end);

        return sentence;
    }
}
