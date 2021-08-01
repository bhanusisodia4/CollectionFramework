import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhset = new LinkedHashSet<>();
        lhset.add("Bhanu");
        lhset.add("Anchal");
        lhset.add("Fareen");
        lhset.add("Fareen");
        lhset.add("Charu");
        lhset.add("Saleena");

        //Traversing through iterable
        for(String s: lhset){
            System.out.print(s+" ");
        }

        System.out.println("++++++++++++++++++");

        TreeSet<String> tset = new TreeSet<>();
        tset.addAll(lhset);
        //Traversing through iterable
        for(String s: tset){
            System.out.print(s+" ");
        }

    }
}
