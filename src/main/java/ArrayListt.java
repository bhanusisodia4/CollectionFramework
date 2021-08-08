import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListt {
    public static void main(String[] args) {

        //Type safe
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Bhanu");
        alist.add("Shanu");
        alist.add("Bhoomi");
        alist.add("Biitu");
        alist.add("Shyam");
        alist.add("Ram");
        alist.add("Ram");
        alist.add("Hare");
        alist.add("Shyam ");

        //printing through iterable

        for(String s: alist){
            System.out.print(s+" ");
        }
        System.out.println();
        //removing element
        alist.remove("Shanu");//removing object
        alist.remove(3);

        //printing through iterator
        Iterator itr =alist.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        alist.set(0,"mohit"); //setting or changing element at index 0

        //printing through listIterator backward

        ListIterator lst = alist.listIterator(alist.size());
        while(lst.hasPrevious()){
            System.out.print(lst.previous()+" ");
        }

    }
}
