import java.util.Set;
import java.util.HashMap;
public class tracklist {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Master of Puppets", "Holding your strings");
        userMap.put("Ride the Lightning", "Lightning");
        userMap.put("Nothing else matters", "Trust I seek, and I find in you");
        userMap.put("Fade to black", "Life it seems to fade away");
        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}

