package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Итерируемая коллекция объектов Pair.
 *
 * @author Michael S. Kirkpatrick and Nathan Sprague
 * @version V1, 8/2017
 */
public class Pairs<K, V> implements Iterable<Pair<K, V>> {

    /* TODO: Объявить массив фиксированного размера (максимум 10 элементов) объектов Pair */
    /**
     *
     * Создайте коллекцию, в которой будут храниться элементы, добавленные парами.
     */
    public static final int CAPACITY= 10;
    private  final Pair<K, V> []paris;

    private int idx;

    @SuppressWarnings("unchecked")
    public Pairs() {
        paris = new Pair[CAPACITY];
    }

    /**
     * TODO: Создайте новую пару и добавьте ее в коллекцию, если есть место.
     *
     * @param first  Первый объект
    * @param second Второй объект
     * @return true - если пара была добавлена, false - в противном случае
     */
    public boolean addPair(K first, V second) {
if (idx < CAPACITY){
    paris [idx] = new Pair<>(first,second);
    idx++;
    return true;
}
        return false;
    }


   @Override
    public Iterator<Pair<K, V>> iterator() {
       return new PairIterator();
    }

    /*
     * TODO: Реализуйте итератор здесь на основе документации API по адресу
     * https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html Throw the exceptions as
     * specified
     */
    private class PairIterator implements Iterator<Pair<K, V>> {

        private int i;
        private boolean calledNext;

        /**
         * TODO: Проверить наличие следующего элемента в итераторе
         */
        @Override
        public boolean hasNext() {
          return i < idx;
        }

        /**
         * TODO: Вернуть следующую пару в итератор.
         * @throws NoSuchElementException - если больше нет элементов для итерации
         */
        @Override
        public Pair<K, V> next() {
            calledNext = true;
            if (i >= idx) {
                throw new NoSuchElementException();
            }
            return paris[i++];
        }

        /**
         * TODO: Удалите предыдущую пару, возвращенную функцией next()
         */
        @Override
        public void remove() {
            if (!calledNext) {
                throw new IllegalStateException();
            }
            for (int j=i; j<idx; j++) {
paris[j-1] = paris[j];
            }
            idx--;
            calledNext = false;
        }
    }
}
