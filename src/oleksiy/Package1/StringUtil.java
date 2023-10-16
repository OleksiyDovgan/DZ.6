package oleksiy.Package1;
import java.util.List;

public class StringUtil {
    public static int countOccurance(List<String> wordList, String target) {
        int count = 0;
        for (String word : wordList) {
            if (word.equals(target)) {
                count++;
            }
        }
        return count;
    }
}
