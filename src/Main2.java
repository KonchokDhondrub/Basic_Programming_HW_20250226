import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "apple",
                "banana", "apple", "banana", "apple", "grape", "banana",
                "grape", "grape", "kiwi", "lemon", "apple", "apple",
                "apple", "apple", "apple", "apple"
        );
        List<String> result = getMoreThan5SimilarStrings(list);
        System.out.println(result);
    }

//    public static List<String> getMoreThan5SimilarStrings(List<String> list) {
//        Map<String, Integer> map = new HashMap<>();
//        List<String> result = new ArrayList<>();
//        int n = 5;
//        for (String str : list) {
//            int count = map.getOrDefault(str, 0);
//            if (count==n-1) {
//                result.add(str);
//                continue;
//            }
//            map.put(str, count+1);
//        }
//        return result;
//    }

    public static List<String> getMoreThan5SimilarStrings(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : list) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        List<String> result = new ArrayList<>();


        for (var entry : map.entrySet()) {
            if (entry.getValue() >= 5) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static List<String> getMoreThan5SimilarStrings_Collections(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String str : new HashSet<>(list)) {
            int count = Collections.frequency(list, str);
            if (count >= 5) {
                result.add(str);
            }
        }
        return result;
    }

    public static List<String> getMoreThan5SimilarStrings_On2(List<String> list) {
        List<String> result = new ArrayList<>();

        for (String str : new HashSet<>(list)) {
            int count = 0;
            for (String s : list) {
                if (s.equals(str)) {
                    count++;
                    if (count >= 5) break;
                }
            }
            if (count >= 5) {
                result.add(str);
            }
        }
        return result;
    }
}
