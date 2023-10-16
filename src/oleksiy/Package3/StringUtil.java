package oleksiy.Package3;

import oleksiy.WordOccurrence;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class StringUtil {
    public static List<WordOccurrence> findOccurance(List<String> wordList) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        for (String word : wordList) {
            occurrenceMap.put(word, occurrenceMap.getOrDefault(word, 0) + 1);
        }

        List<WordOccurrence> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            result.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }

        return result;
    }
}

