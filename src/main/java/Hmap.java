import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hmap {
    public static void main(String[] args) {

        HashMap<Integer,String> hmap = new HashMap<>();
        hmap.put(0,"don");
        hmap.put(1,"Won");
        hmap.put(2,"Reshma");
        hmap.put(3,"swathi");
        hmap.put(4,"papa");

        for(int i: hmap.keySet()){
            System.out.print(hmap.get(i)+" ");
        }
        System.out.println();

        LinkedHashMap <Integer,String> lhmap = new LinkedHashMap<>();
        lhmap.put(0,"don");
        lhmap.put(1,"Won");
        lhmap.put(2,"Reshma");
        lhmap.put(3,"swathi");
        lhmap.put(4,"papa");
        lhmap.put(5,"papa");
        for(int i: lhmap.keySet()){
            System.out.print(lhmap.get(i)+" ");
        }

    }
}
