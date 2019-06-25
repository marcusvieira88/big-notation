import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BigNotationMain {

    public static void main(String[] args) {

        // ################ Example of constant time algorithm O(1) ################

        //Simple example with constant time execution
        System.out.println("Print text");

        // Collection ArrayList example
        //
        // ArrayList JavaDoc
        //
        //<p>The <tt>size</tt>, <tt>isEmpty</tt>, <tt>get</tt>, <tt>set</tt>,
        //<tt>iterator</tt>, and <tt>listIterator</tt> operations run in constant
        // time.  The <tt>add</tt> operation runs in <i>amortized constant time</i>,
        // that is, adding n elements requires O(n) time.  All of the other operations
        // run in linear time (roughly speaking).  The constant factor is low compared
        // to that for the <tt>LinkedList</tt> implementation.

        List<String> array = new ArrayList<>();
        array.add("ItemA");
        array.add("ItemB");
        array.add("ItemC");
        array.add("ItemD");
        array.add("ItemE");

        // ArrayList get method runs in a constant time
        System.out.println(array.get(2));

        // ################ Example of linear time algorithm O(n) ################

        //Simple example with linear time execution
        int n = 100; // this amount of items will impact directly the algorithm performance
        for (int i = 0; i < n; i++) {
            System.out.println("Print text");
        }

        // Collection LinkedList example
        //
        // LinkedList JavaDoc
        //
        // <p>All of the operations perform as could be expected for a doubly-linked
        // list.  Operations that index into the list will traverse the list from
        // the beginning or the end, whichever is closer to the specified index.

        List<String> list = new LinkedList<>();
        list.add("ItemA");
        list.add("ItemB");
        list.add("ItemC");
        list.add("ItemD");
        list.add("ItemE");

        // LinkedList get method runs in a linear time
        System.out.println(list.get(2));

        // ################ Example of logarithmic time algorithm O(log n) ################

        //Simple example with logarithmic time execution in the base 2
        for (int i = 1; i < n; i = i * 2){
            System.out.println("Checking item = " + i);
        }

        // Collection TreeSet example
        //
        // TreeSet JavaDoc
        // <p>This implementation provides guaranteed log(n) time cost for the basic
        // operations ({@code add}, {@code remove} and {@code contains}).

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(40);
        tree.add(50);

        // TreeSet higher method runs in a logarithmic time
        System.out.println(tree.higher(23));
    }
}
