package generics;

public class KeyValuePair <K, V>{//to add multiple type parameters
    private K key;
    private V value;

    public KeyValuePair(K key, V value){
        this.key = key;
        this.value = value;
    }
}
