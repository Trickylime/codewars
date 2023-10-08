import java.util.ArrayList;
import java.util.List;

public class Kata {
  
    public static List<Object> filterList(final List<Object> list) {

        List<Object> mutableList = new ArrayList<>(list);
        mutableList.removeIf(obj -> obj instanceof String);
        return mutableList;
    }
}