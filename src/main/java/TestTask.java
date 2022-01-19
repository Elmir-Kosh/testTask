import java.util.*;

public class TestTask {


    public static void main(String[] args) {
    }

    public  Map<String, Integer> counterFunction(List<String> list) {
        Map<String, Integer> counter = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (String name : list) {
            if (counter.containsKey(name)) {
                counter.put(name, counter.get(name) + 1);
            } else {
                counter.put(name, 1);
            }
        }
        return counter;
    }

    public void print(Map<String, Integer> counter) {
        for (String namePrint : counter.keySet()) {
            System.out.println(namePrint.substring(0, 1).toUpperCase(Locale.ROOT) + namePrint.substring(1).toLowerCase(Locale.ROOT) + ": " + counter.get(namePrint));
        }
    }

}
