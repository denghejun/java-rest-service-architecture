package rest.service.architecture.domain.core;

import java.util.Hashtable;

public class Caching<TKey extends Enum> {
    private Hashtable map = new Hashtable();

    public <T> T get(TKey key) {
        return (T) this.map.get(key);
    }

    public <T> T set(TKey key, T value) {
        this.map.put(key, value);
        return value;
    }

    public boolean has(TKey key) {
        return this.map.containsKey(key);
    }
}
