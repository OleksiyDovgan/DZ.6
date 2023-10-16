package oleksiy;

import java.util.List;
import java.util.ArrayList;


public class ArrayToList {
    public static List<Integer> toList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }
}
