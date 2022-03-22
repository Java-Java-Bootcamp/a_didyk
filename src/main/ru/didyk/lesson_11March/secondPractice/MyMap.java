package ru.didyk.lesson_11March.secondPractice;

import java.util.*;

//реализация map

public class MyMap<K, V> implements Map<K, V> {

    private List<V>[] values = new ArrayList[10];
    private List<K>[] keys = new ArrayList[10];
    private int loadFactor;
    private int size;


    private void calcLoadFactory() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        int hash = key.hashCode();
        int index = hash / keys.length;

        List<K> keyBucket = keys[index];
        if (keyBucket == null || !keyBucket.contains(key)) {
            return null;
        }

        if (keyBucket.contains(key)) {
            int keyIndex = keyBucket.indexOf(key);
            return values[index].get(keyIndex);
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        int index = key.hashCode() % values.length;

        List<K> keyBucket = keys[index];

        // если нет хранилища ключей
        if (keyBucket == null) {
            List<K> keysBucket = new ArrayList<>(); //создаём новое хранилище ключей
            keysBucket.add(key); // добавляем в это хранилище ключ
            keys[index] = keysBucket; // добавляем хранилище в основное хранилище

            List<V> valuesBucket = new ArrayList<>(); //создаём новое хранилище значений
            valuesBucket.add(value); // добавляем в это хранилище значение
            values[index] = valuesBucket; // добавляем в основное хранилище новосозданное хранилище
            return value;
        }

        // если нет ключа
        if (!keyBucket.contains(key)) {
            keyBucket.add(key);
            values[index].add(value);
        }

        // если есть и ключ и значение
        if (keyBucket.contains(key)) {
            int keyIndex = keyBucket.indexOf(key);
            List<V> bucket = values[index];
            if (bucket.contains(value) && bucket.indexOf(value) == keyIndex) {
                 return value;
            }
        }

        // если ключ есть а значение другое
        if(keyBucket.contains(key)) {
            int keyIndex = keyBucket.indexOf(key);
            List<V> bucket = values[index];
            if(!bucket.contains(value)) {

            }
        }

        var temp = values[index];
        if (temp.contains(value)) {
            return (V) temp.get(index);
        }
        temp.add(value);
        return (V) temp.get(index);
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
