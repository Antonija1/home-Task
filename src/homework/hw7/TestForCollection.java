package homework.hw7;

import java.lang.reflect.Array;
import java.util.*;


/**
 19.03.2015
 * Created by Tonja
 */
public class TestForCollection {
    public static void main(String[] args) {
        CollectionUtilsClass unionCollection = new CollectionUtilsClass();
        Collection<Integer> collection1 = new ArrayList<Integer>(Arrays.asList(56, 6, 9, 12, 5, 9, 10));
        Collection<Integer> collection2 = new ArrayList<Integer>(Arrays.asList(6, 4, 8, 4));
        System.out.println("new collection that holds values from two collections. Duplicates are allowed: "
                           + unionCollection.union(collection1, collection2));
        System.out.println("new collection that holds common values from two collections. Duplicates are allowed: "
                           + unionCollection.intersection(collection1, collection2));
        System.out.println("new collection that holds values from two collections. Duplicates NOT are allowed:  "
                           + unionCollection.unionWithoutDuplicates(collection1, collection2));
        System.out.println("new collection that holds common values from two collections. Duplicates are NOT allowed: "
                           + unionCollection.intersectionWithoutDuplicates(collection1, collection2));
        System.out.println("new collection that holds different values. Duplicates are allowed: "
                           + unionCollection.difference(collection1,collection2)+"\n\n");

        ListUtilsClass listUtils = new ListUtilsClass();
        System.out.println("Represent arguments as list: "+listUtils.asList("And", "in ", "our ", "city ", "spring ",
                "has ", "come"));
        System.out.println(listUtils.sortedList(Arrays.asList(12, 17, 3, 8, 48, 6, 1, 9)));
        System.out.println();
       // Collection
        SetUtilsClass setUtils = new SetUtilsClass();
        Set<String> list = new HashSet<>();
        list.add("And");
        list.add("in");
        list.add("our");
        list.add("city");
        list.add("spring");
        list.add("has");
        list.add("come");
        System.out.println(setUtils.orderedSet(collection1,list).toString());
 }
}
