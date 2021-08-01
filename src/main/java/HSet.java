import java.util.HashSet;
import java.util.Iterator;

public class HSet {
    public static void main(String[] args) {

        HashSet <Integer> hset = new HashSet<>();
        hset.add(22);
        hset.add(33);
        hset.add(11);
        hset.add(11); //this will not add as Sets dont allow duplicates
        hset.add(88);
        hset.add(9);

        System.out.println(hset);
        //traversing through iterable
        for(int i: hset){
            System.out.print(i+" ");
        }
        System.out.println();
        hset.remove(88);

        //traversing through iterator
        Iterator iset = hset.iterator();
        while (iset.hasNext()){
            System.out.print(iset.next()+" ");
        }
    }
}
