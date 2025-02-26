import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("jack", 10);
        map.put("john", 5);

        print(map);
        System.out.println();

        mergeKeysAndValues(map, "jack", "john");
        print(map);
    }

    public static void print(Map<String, Integer> map) {
        System.out.println("Map:{");
        int i = 0;
        for (String key : map.keySet()) {
            System.out.println("\t\"" + key + ((i == 2) ? "\":" : "\",") + map.get(key));
            i++;
        }
        System.out.println("}");
    }

    public static void mergeKeysAndValues(Map<String, Integer> map, String key1, String key2) {
        if (map.containsKey(key1) && map.containsKey(key2)) {
            String newKey = key1 + "_" + key2;
            int sum = map.get(key1) + map.get(key2);
            map.put(newKey, sum);
        }
    }
}