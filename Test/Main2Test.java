import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class Main2Test {

    @Test
    @DisplayName("Get original result")
    public void testGetMoreThan5SimilarStrings() {
        List<String> list = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "apple",
                "banana", "apple", "banana", "apple", "grape", "banana",
                "grape", "grape", "kiwi", "lemon"
        );

        List<String> result = Main2.getMoreThan5SimilarStrings(list);

        assertEquals(2, result.size());
        assertTrue(result.contains("apple"));
        assertTrue(result.contains("banana"));
    }

    @Test
    @DisplayName("Empty list")
    public void testGetMoreThan5SimilarStrings_EmptyList() {
        List<String> list = Arrays.asList();

        List<String> result = Main2.getMoreThan5SimilarStrings(list);

        assertTrue(result.isEmpty(), "Result is empty");
    }

    @Test
    @DisplayName("No repeats")
    public void testGetMoreThan5SimilarStrings_NoRepeats() {
        List<String> list = Arrays.asList("apple", "banana", "orange", "grape");

        List<String> result = Main2.getMoreThan5SimilarStrings(list);

        assertTrue(result.isEmpty(), "Result don't have 5 values");
    }
}
