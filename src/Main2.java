import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "apple",
                "banana", "apple", "banana", "apple", "grape", "banana",
                "grape", "grape", "kiwi", "lemon"
        );
        List<String> result = getMoreThan5SimilarStrings(list);
        System.out.println(result);
    }

    public static List<String> getMoreThan5SimilarStrings(List<String> list) {
        List<String> result = new ArrayList<>();

        for (String str : list) {
            int count = 0;
            for (String s : list) {
                if (s.equals(str)) {
                    count++;
                }
            }
            if (count >= 5 && !result.contains(str)) {
                result.add(str);
            }
        }
        return result;
    }
}
