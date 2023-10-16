package oleksiy;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Record> records = new ArrayList<>();

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> result = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                result.add(record);
            }
        }
        return result.isEmpty() ? null : result;
    }
}
