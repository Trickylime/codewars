import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        
        List<String> result = new ArrayList<>();
        int i = 1;
        for (String s : lines) 
            result.add(i++ + ": " + s);
        return result;
    }
}