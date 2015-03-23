package homework.hw7;

import com.sourceit.hometask.collections.ListUtils;

import java.util.*;

/**
 *  Implementation for the
 *  ListUtils
 *   19.03.2015.
 * Created by Tonja.
 */
public class ListUtilsClass implements ListUtils{
   @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        if (strings == null){
                throw new IllegalArgumentException(" one of the set arguments is null");
            }
            List<String> list = new ArrayList<String>();
            list = Arrays.asList(strings);
            return list;
        }

    @Override
    public <T extends Comparable<T>> List<T> sortedList(List<T> list) throws IllegalArgumentException {
        if (list == null){
            throw new IllegalArgumentException("one of the parameters is null");
        }
        List<T> sortedL = new ArrayList<T>();
        sortedL.addAll(list);
        Collections.sort(sortedL, new Comparator<T>() {
            public int compare(T s1, T s2) {
                return s1.toString().compareTo(s2.toString());
            }
        });
        return sortedL;
    }
}
