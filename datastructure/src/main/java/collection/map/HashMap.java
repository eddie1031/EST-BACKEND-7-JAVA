package collection.map;

import collection.Collection;
import collection.arrayList.ArrayList;
import collection.linkedList.LinkedList;

public class HashMap<K, V> implements Map<K, V> {

    private static final int CAPACITY = 16;
    private final LinkedList<Node<K, V>>[] buckets;

    private int size;

    @SuppressWarnings("unchecked")
    public HashMap() {
        this.buckets = new LinkedList[CAPACITY];
        for ( int i = 0; i < CAPACITY; i++ ) {
            buckets[i] = new LinkedList<>();
        }
        this.size = 0;
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode()) % CAPACITY;
    }

    @Override
    public V put(K key, V value) {

        int idx = getHash(key);

        LinkedList<Node<K, V>> bucket = buckets[idx];

        for ( int i = 0; i < bucket.size(); i++ ) {
            Node<K, V> node = bucket.get(i);
            if ( node.key.equals(key) ) {
                node.value = value;
                return value;
            }
        }

        bucket.add(new Node<>(key, value));
        size++;

        return value;
    }

    @Override
    public V get(K key) {

        int idx = getHash(key);

        LinkedList<Node<K, V>> bucket = buckets[idx];

        for ( int i = 0; i < bucket.size(); i++ ) {
            Node<K, V> node = bucket.get(i);
            if ( node.key.equals(key)) {
                return node.value;
            }
        }

        return null;
    }

    @Override
    public V remove(K key) {

        int idx = getHash(key);
        LinkedList<Node<K, V>> bucket = buckets[idx];

        for ( int i = 0; i < bucket.size(); i++ ) {
            Node<K, V> node = bucket.get(i);
            if ( node.key.equals(key)) {
                bucket.remove(node);
                size--;
                return node.value;
            }
        }

        return null;
    }

    @Override
    public V replace(K key, V value) {

        int idx = getHash(key);
        LinkedList<Node<K, V>> bucket = buckets[idx];

        for ( int i = 0; i < bucket.size(); i++ ) {
            Node<K, V> node = bucket.get(i);
            if ( node.key.equals(key)) {
                V originValue = node.value;
                node.value = value;
                return originValue;
            }
        }

        return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Collection<V> values() {

        ArrayList<V> valueList = new ArrayList<>();

        for ( int i = 0; i < buckets.length; i++ ) {
            LinkedList<Node<K, V>> bucket = buckets[i];
            for ( int j = 0; j < bucket.size(); j++ ) {
                valueList.add(bucket.get(j).value);
            }
        }

        return valueList;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(K key) {

        if ( key == null ) {
            return false;
        }

        int idx = getHash(key);
        LinkedList<Node<K, V>> bucket = buckets[idx];

        for ( int i = 0; i < bucket.size(); i++ ) {
            Node<K, V> node = bucket.get(i);
            if ( node.key.equals(key) ) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean containsValue(V value) {

        for ( int i = 0; i < buckets.length; i++ ) {
            LinkedList<Node<K, V>> bucket = buckets[i];
            for ( int j = 0; j < bucket.size(); j++ ) {
                Node<K, V> node = bucket.get(j);
                if ( node.value.equals(value)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static class Node<K, V> {

        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

}
