import java.util.ArrayList;
import java.util.HashMap;

public class FilterDuplicate {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println(list);

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if(map.containsKey(list.get(i))) {
                int count = map.get(list.get(i));
                map.put(list.get(i), count+1);
            } else {
                map.put(list.get(i), 1);
            }
        }
        System.out.println(map);
        /*for (int i = 0; i < map.size(); i++) {
            if (map.get(i) > 1) {
                map.
            }*/


        }
    }