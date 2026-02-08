package lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Integer> numbersArrayList = new ArrayList<>();
        numbersArrayList.add(1);
        numbersArrayList.add(8);
        numbersArrayList.add(2);
        numbersArrayList.add(4);
        numbersArrayList.add(99);

        List<Integer> numbersLinkedList = new LinkedList<>();
        numbersLinkedList.add(1);
        numbersLinkedList.add(2);
        numbersLinkedList.add(4);
        numbersLinkedList.add(99);

        System.out.println("первая коллекция:" + numbersArrayList);
        System.out.println("вторая коллекция:" + numbersLinkedList);

        CollectionUtils collectionUtils = new CollectionUtilsImpl();
        System.out.println("реализация метода union: " + collectionUtils.union(numbersArrayList, numbersLinkedList));
        System.out.println("реализация метода intersection: " + collectionUtils.intersection(numbersArrayList,numbersLinkedList));
        System.out.println("реализация метода unionWithoutDuplicate: " + collectionUtils.unionWithoutDuplicate(numbersArrayList,numbersLinkedList));
        System.out.println("реализация метода intersectionWithoutDuplicate: " + collectionUtils.intersectionWithoutDuplicate(numbersArrayList,numbersLinkedList));
        System.out.println("реализация метода difference: " + collectionUtils.difference(numbersArrayList,numbersLinkedList));
    }
}
