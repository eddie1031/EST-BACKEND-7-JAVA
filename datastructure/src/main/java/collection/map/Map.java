package collection.map;

import collection.Collection;

public interface Map<K, V> {

    // JDK 22
    // https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Map.html

    V put(K key, V value);

    V get(K key);

    V remove(K key);

    V replace(K key, V value);

    int size();

    Collection<V> values();

    boolean isEmpty();

    boolean containsKey(K key);
    boolean containsValue(V value);

}
