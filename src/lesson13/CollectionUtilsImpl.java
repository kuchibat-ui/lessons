package lesson13;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        // Объединение двух коллекций с дубликатами
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        //Пересечение двух коллекций с дубликатами
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> result = new ArrayList<>();
        for (Integer index : a) {
            if (b.contains(index)) {
                result.add(index);
            }
        }
        for (Integer index : b) {
            if (a.contains(index)) {
                result.add(index);
            }
        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        // Объединение двух коллекций без дубликатов
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Set<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        //Пересечение двух коллекций без дубликатов
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Set<Integer> result = new HashSet<>();
        for (Integer i : a) {
            if (b.contains(i)) {
                result.add(i);
            }
        }
        for (Integer i : b) {
            if (a.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        //Разность двух коллекций
        if (a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> result = new ArrayList<>();
        for (Integer i : a) {
            if (!b.contains(i)) {
                result.add(i);
            }
        }
        for (Integer i : b) {
            if (!a.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
