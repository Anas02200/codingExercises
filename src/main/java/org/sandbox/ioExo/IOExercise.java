package org.sandbox.ioExo;


import java.io.*;
import java.util.Scanner;

public class IOExercise {
    public static void writeToFile(String content, String fileName) {
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user to input text from the console
        System.out.println("Enter text to write to the file:");



        // Change this if you want a different file name

        // Step 3: Use Java's IO API to write the user input to a text file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write the user input to the file
            // Replace the 'TO_BE_COMPLETED' part with the correct code
            // Hint: Use writer.write() method to write the user input to the file
            // Hint: Don't forget to close the writer after writing
            // TO_BE_COMPLETED

            writer.write(content);

            // Optional: You can display a message confirming the successful write operation
            System.out.println("Text successfully written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public void copyFile(String sourceFileName, String destinationFileName) throws IOException {
        // Implement copying contents from source file to destination file
        try (InputStream inStream = new FileInputStream(sourceFileName);
             OutputStream outStream = new FileOutputStream(destinationFileName)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
        }
    }

    public String readFileContent(String fileName) throws IOException {
        // Implement reading content from a file
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    public void writeToExistingFile(String fileName, String contentToWrite) throws IOException {
        // Implement writing content to an existing file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(contentToWrite);
        }
    }

    public void createDirectory(String directoryName) {
        // Implement creating a directory
        File directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public boolean isFileExists(String fileName) {
        // Implement checking if a file exists
        File file = new File(fileName);
        return file.exists();
    }
}