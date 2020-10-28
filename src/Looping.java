import java.util.ArrayList;
import java.util.Iterator;

public class Looping {
    public static void main(String[] args) {
        String s = "el teeeta           fel nannna wel            nanna fel    teeetaa    ";
        //System.out.println(s.replace(" " , ""));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        for (Object ob: list
             ) {
            System.out.println(ob);
            
        }
    }
}
