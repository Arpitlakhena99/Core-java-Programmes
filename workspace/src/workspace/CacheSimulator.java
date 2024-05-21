package workspace;
import java.util.LinkedHashMap;
import java.util.Map;

public class CacheSimulator {
    private static final int CACHE_SIZE = 4;
    private LinkedHashMap<Integer, CacheEntry> cache;
    private int accessCount;
    private int hitCount;
    public CacheSimulator() {
        cache = new LinkedHashMap<Integer, CacheEntry>(CACHE_SIZE, 1.0f, true) {
            private static final long serialVersionUID = 5723584629050452883L;

            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, CacheEntry> eldest) {
                return size() > CACHE_SIZE;
            }
        };
    }
     public void access(int memoryAddress) {
        accessCount++;
        CacheEntry entry = cache.get(memoryAddress);

        if (entry == null) {
            // Cache miss
            System.out.println("Cache miss: Address " + memoryAddress);
            if (cache.size() >= CACHE_SIZE) {
                // Cache eviction
                Map.Entry<Integer, CacheEntry> eldestEntry = cache.entrySet().iterator().next();
                System.out.println("Evicting: Address " + eldestEntry.getKey());
                cache.remove(eldestEntry.getKey());
            }
            entry = new CacheEntry();
            entry.setAddress(memoryAddress);
            cache.put(memoryAddress, entry);
        } else { 
            System.out.println("Cache hit: Address " + memoryAddress);
            hitCount++;
        }
    }
    public double calculateHitRate(){
        double hitRate = (double) hitCount / accessCount;
        return hitRate;
      }
    private class CacheEntry {
        private int address;
        public void setAddress(int address) {
        this.address = address;
           }
        public int getAddress() {
            return address;
         }
       }
    public static void main(String[] args) {
        int[] testSet = {1, 10, 2, 1, 10, 11, 14, 10, 10, 1};
        CacheSimulator cacheSimulator = new CacheSimulator();

        for (int address : testSet){
            cacheSimulator.access(address);
          }
        double hitRate = cacheSimulator.calculateHitRate();
        System.out.println("Hit rate: " + hitRate);
       }
     }
