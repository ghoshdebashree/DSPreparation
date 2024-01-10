import java.util.HashMap;
import java.util.Map;

public class CheckPath {
    public static String checkPath(Map<String, String> map) {

        String result = "";
        HashMap<String, String> reversedMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet())
            reversedMap.put(entry.getValue(), entry.getKey());
        String from = "";
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!reversedMap.containsKey(entry.getKey())) {
                count++;
                from = entry.getKey();
            }
        }
        if (count > 1) return null; //for disconnected graph

        //Trace the path
        String to = map.get(from);
        while (to != null) {
            result += from + " -> " + to + ",";
            from = to;
            to = map.get(to);
        }

        return result;
    }
    public static void main(String[] args){
        HashMap<String ,String> hMap = new HashMap<>();
        hMap.put("Mumbai","Bangalore");
        hMap.put("Kolkata","Hydrabad");
        hMap.put("Hydrabad","Ranchi");
        hMap.put("Ranchi","Mumbai");

        String result = checkPath(hMap);
        System.out.println(result);
    }

}
