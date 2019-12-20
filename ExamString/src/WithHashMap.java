import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WithHashMap {


    public int maxLength(String string) {
        if (string == "") return 0;
        Map<Character, Integer> res = new HashMap<>();
        for (int i = 0; i < string.length(); i++)
            res.merge(string.charAt(i), 1, (val, newVal) -> val + newVal);

        return Collections.max(res.values());

    }
}
