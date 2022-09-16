## LFU Cache

### Description

### Solution

```
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class LFUCache<T> {

    private final int capacity;

    private final Map<String, T> cache;

    private final LinkedList<String> order;

    public LFUCache(int capacity) {
        this.capacity = capacity;

        cache = new HashMap<>();
        order = new LinkedList<>();
    }

    public void put(String key, T value) {
        if(cache.size() >= capacity) {
            cache.remove(order.getFirst());
        }

        cache.put(key, value);
        order.addLast(String.valueOf(key));
    }

    public T get(String key) {
        if(!cache.containsKey(key)) {
            return null;
        }

        String keyStr = String.valueOf(key);
        order.remove(keyStr);
        order.addLast(keyStr);

        return cache.get(key);
    }

}
```

### Test Case

```
public static void main(String[] args) {
    LFUCache<Integer> lfuCache = new LFUCache<>(3);
    lfuCache.put("1",1);
    lfuCache.put("2",2);
    System.out.println(lfuCache.get("1"));
    lfuCache.put("3",3);
    System.out.println(lfuCache.get("2"));
    System.out.println(lfuCache.get("3"));
    lfuCache.put("4",4);
    System.out.println(lfuCache.get("1"));
    System.out.println(lfuCache.get("3"));
    System.out.println(lfuCache.get("4"));
}
```