import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class NumberUtil {
    public static List<Integer> findUnique(List<Integer> numbers) {
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        return new ArrayList<>(uniqueNumbers);
    }
}
