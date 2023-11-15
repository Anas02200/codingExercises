import org.junit.jupiter.api.Test;
import org.sandbox.ioExo.IOExercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class IOExerciseTest {

    @Test
    public void testFileWriting() {
        // Given
        String testInput = "This is a test input.";

        // When
        IOExercise.writeToFile(testInput, "testOutput.txt");

        // Then
        String fileContent = readFileContent("testOutput.txt");
        assertEquals(testInput, fileContent.trim());
    }




    @Test
    public void testWriteToExistingFile() throws IOException {
        String fileName = "existingFile.txt";
        String contentToWrite = "New content to append.\n";

        IOExercise ioExercise = new IOExercise();
        ioExercise.writeToExistingFile(fileName, contentToWrite);

        String expectedContent = "Existing content.\nNew content to append.\n";
        String actualContent = ioExercise.readFileContent(fileName);


    }

    @Test
    public void testCreateDirectory() {
        String directoryName = "testDirectory";

        IOExercise ioExercise = new IOExercise();
        ioExercise.createDirectory(directoryName);

        File directory = new File(directoryName);

        assertTrue(directory.exists());
        assertTrue(directory.isDirectory());
    }

    @Test
    public void testIsFileExists() {
        String existingFileName = "existingFile.txt";
        String nonExistingFileName = "nonExistingFile.txt";

        IOExercise ioExercise = new IOExercise();

        assertTrue(ioExercise.isFileExists(existingFileName));
        assertFalse(ioExercise.isFileExists(nonExistingFileName));
    }

    private String readFileContent(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString().trim();
    }
}