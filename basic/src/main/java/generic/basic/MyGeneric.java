package generic.basic;

public class MyGeneric<K, V, T> {

    private K key;
    private V value;
    private T type;

    public MyGeneric() {
    }

    public MyGeneric(K key, V value, T type) {
        this.key = key;
        this.value = value;
        this.type = type;
    }

    // Getter, Setter
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MyGeneric{" +
                "key=" + key +
                ", value=" + value +
                ", type=" + type +
                '}';
    }

}
