package homework.hw7;

import com.sourceit.hometask.collections.SetUtils;

import java.util.*;
import java.util.function.BiConsumer;

import static java.lang.reflect.Array.get;
import static java.lang.reflect.Array.getInt;

/**
 * Implementation for the
 * SetUtils
 * 19.03.2015
 * Created by Tonja .
 * не работает
 */
public class SetUtilsClass implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {

        if (collection1 == null || set2 == null) {
            throw new NullPointerException("collection1 or set2 are null");
        }
        Collection<Integer> coll = new ArrayList<>();
        Set<String> set1 = new HashSet<>();
        coll.addAll(collection1);
        set1.addAll(set2);
        Map<Integer, String> maptable = new TreeMap<Integer, String>();
        for (int c : coll) {
            for (String s : set1) {
                maptable.put(c, s);
            }
        }
        // получить набор элементов
        Set<Map.Entry<Integer, String>> set = maptable.entrySet();
        for (Map.Entry<Integer, String> me : set) {
            //    return me.getValue();
        }
        //object get(int index) — возвращает элемент, находящийся в позиции index;
        //Object getValue() – возвращает значение пары.

        SortedSet sortedSet = new TreeSet<>();//TreeSet (Collection coll) — создает объект, содержащий все
        // элементы коллекции  coll, с естественным порядком ее элементов;
        return sortedSet;
    }


    @Override
    public Set<Integer> customOrderSet(Integer... integers) throws NullPointerException {
        if (integers == null) throw new NullPointerException(" one of the set arguments is null");
        Set<Integer> integerLinkedHash = new LinkedHashSet<>();// класс LinkedHashSet поддерживает связный список элементов
        // набора в том порядке, в котором они вставлялись
        for (Integer i : integers) {
            integerLinkedHash.add(i);
        }
        return integerLinkedHash;
    }
}


