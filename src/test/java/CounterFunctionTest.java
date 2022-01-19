import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class CounterFunctionTest extends TestTask {

    @Test
    public void counterFunctionKeyTest() {
        List<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Alice");
        list.add("Joe");
        list.add("bob");
        list.add("alice");

        Set<String> keysValue = counterFunction(list).keySet();
        Assertions.assertEquals(3, keysValue.size());
    }

    @Test
    public void counterFunctionRegisterTest() {
        List<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Alice");
        list.add("Joe");
        list.add("bob");
        list.add("alice");

        List<String> standartList = new ArrayList<>();
        standartList.add("Alice");
        standartList.add("Bob");
        standartList.add("Jo1");

        Set<String> keysValue = counterFunction(list).keySet();
        Assertions.assertTrue(keysValue.containsAll(standartList));
    }
}
