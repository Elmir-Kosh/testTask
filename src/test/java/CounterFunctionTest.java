import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class CounterFunctionTest extends TestTask {

    @Test
    public void counterFunctionTest() {
        List<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Alice");
        list.add("Joe");
        list.add("bob");
        list.add("alice");
        list.add("");
        list.add("1");

        Set<String> setKeys = counterFunction(list).keySet();
        Assertions.assertEquals(5, setKeys.size());


    }
}
