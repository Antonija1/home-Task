package homework.hw7;

import com.sourceit.hometask.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *Implementation for the
 * CollectionUtils.
 * 19.03.2015
 * Created by Tonja
 */
public class CollectionUtilsClass implements CollectionUtils {

    @Override
    //Новая коллекция, которая содержит общие значения из двух коллекций. Дубликаты разрешено
    public Collection<Integer> union(Collection<Integer> collection1, Collection<Integer> collection2) throws
            NullPointerException {
        if (collection1 == null || collection2 == null) {
            throw new NullPointerException("Exception collection1 or" +
                    " collection2 are equals null ");
        }
        Collection<Integer> union = new ArrayList<>(); // ArrayList — реализует интерфейс List, т.е в тех случаях
        // , когда вам нужен упорядоченный список на основе массива вам следует использовать его.
        union.addAll(collection1);//addAll(Collection col) — добавить все элементы другой коллекции, с схожим типом
        // данных
        union.addAll(collection2);
        return union;
    }

    @Override
    //Новая коллекция, которая содержит значения от двух коллекций. Дубликаты не допускаются
    public Collection<Integer> intersection(Collection<Integer> collection1, Collection<Integer> collection2) throws
            NullPointerException {
        if (collection1 == null || collection2 == null) {
            throw new NullPointerException("Exception collection1 or" +
                    " collection2 are equals null ");
        }
        Collection<Integer> intersection = new ArrayList<>();
        intersection.addAll(collection1);
        intersection.retainAll(collection2); //retainAll(Collection col) — удаляет все элементы, не принадлежащие col
        return intersection;
    }

    @Override
    //Новая коллекция, которая содержит общие значения из двух коллекций. Дубликаты не допускается
    //Set — множество. Содержит все операции интерфейса Collection, но некоторые из них имеют другой смысл. например
    // операция add добавляет только уникальные элементы
    public Set<Integer> unionWithoutDuplicates(Collection<Integer> collection1, Collection<Integer> collection2) throws
            NullPointerException {
        if (collection1 == null || collection2 == null) {
            throw new NullPointerException("Exception collection1 or" +
                    " collection2 are equals null ");
        }
        Set<Integer> unionWithoutDupl = new HashSet<>(); //HashSet - коллекция, не позволяющая хранить
        // одинаковые объекты
        unionWithoutDupl.addAll(collection1);
        unionWithoutDupl.addAll(collection2);
        return unionWithoutDupl;
    }

    @Override
    //Новая коллекция, которая содержит общие значения из двух коллекций. Дубликаты не допускается.
    public Set<Integer> intersectionWithoutDuplicates(Collection<Integer> collection1, Collection<Integer> collection2)
            throws NullPointerException {
        if (collection1 == null || collection2 == null) {
            throw new NullPointerException("Exception collection1 or" +
                    " collection2 are equals null ");
        }
        Set<Integer> intersectionWithoutDupl = new HashSet<>();
        intersectionWithoutDupl.addAll(collection1);
        intersectionWithoutDupl.retainAll(collection2);
        return intersectionWithoutDupl;
    }

    @Override
    //Новая коллекция, которая содержит различные значения. Дубликаты допускается
    public Collection<Integer> difference(Collection<Integer> collection1, Collection<Integer> collection2) throws
            NullPointerException {
        if (collection1 == null || collection2 == null) {
            throw new NullPointerException("Exception collection1 or" +
                    " collection2 are equals null ");
        }
        Collection<Integer> difference = new ArrayList<>();
        difference.addAll(union(collection1, collection2));
        difference.removeAll(intersection(collection1, collection2)); //removeAll(Collection col) — удаляет все
        // элементы, которые есть в коллекции col
        return difference;
    }
}
