/*
We're asked to implement the structure which provides the following operations in O(1) time :

Get the key / Check if the key exists

Put the key

Delete the first added key

The first two operations in O(1) time are provided by the standard hashmap, and the last one - by linked list.

There is a structure called ordered dictionary, it combines behind both hashmap and linked list. In Python this structure is called OrderedDict and in Java LinkedHashMap.
*/
class LRUCache {
    public int capacity;

    private LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        cache = new LinkedHashMap<>();
        this.capacity = capacity;
    }

    private boolean isFull() {
        return capacity == cache.size();
    }

    public int get(int key) {
        //remove first from the cache
        int value = cache.get(key) != null? cache.remove(key) : -1;

        if(value != -1) {
            //put back
            cache.put(key, value);
        }

        return value;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            //remove, then put back (this will affect order)
            cache.remove(key);
        } else {
            if(isFull()) {
                //remove first item
                int firstItemKey = cache.entrySet().iterator().next().getKey();
                cache.remove(firstItemKey);
            }
        }
        cache.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
