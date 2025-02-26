import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

class MainTest {

        @Test
        @DisplayName("Merge Values")
        void mergeKeysAndValues_MergeValues() {
            Map<String, Integer> map = new HashMap<>();
            map.put("jack", 10);
            map.put("john", 5);

            Main.mergeKeysAndValues(map, "jack", "john");

            Assertions.assertEquals(10, map.get("jack"));
            Assertions.assertEquals(5, map.get("john"));
            Assertions.assertEquals(15, map.get("jack_john"));
        }

        @Test
        @DisplayName("Merge Values Missing Key")
        void mergeKeysAndValues_MergeValuesMissingKey() {
            Map<String, Integer> map = new HashMap<>();
            map.put("jack", 10);

            Main.mergeKeysAndValues(map, "jack", "john");

            Assertions.assertFalse(map.containsKey("jack_john"));
        }

    @Test
    @DisplayName("Merge Values with Empty Map")
    void mergeKeysAndValues_EmptyMap() {
        Map<String, Integer> map = new HashMap<>();

        Main.mergeKeysAndValues(map, "jack", "john");

        Assertions.assertTrue(map.isEmpty());
        Assertions.assertNull(null);
    }

    }