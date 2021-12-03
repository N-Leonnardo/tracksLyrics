import java.util.Set;
import java.util.HashMap;

public class LyricsTest {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Firework", "Kate Perry");
        userMap.put("Grenade", "Bruno Mars");
        userMap.put("Beliver", "Imagine Dragons");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
            System.out.println("*****************");    
        }
    }
}

