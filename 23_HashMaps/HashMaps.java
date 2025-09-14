import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class HashMaps {
    public static void main(String[] args) {
        String name = "Nilam";
        int code = name.hashCode();
        System.out.println(code);

        // for addressing in hashmaps -> hashing is performed and for collision
        // there are 2 ways
        // 1. chaining
        // 2. open addressing
        // 1. in chaining then again we have to search and it takes time
        // so we cheat -> simple uniform hashing
        // assumption: every key is equally likely to be hashed to any slot in the table
        // independent of where all previous key are hashed
        // size = 10 items =20 -> then every cell have 2 items O(1)
        // hash functions -> 1.division : h(k) = k % m (m prime no. not too close to power of 2 or 10)
        // 2. multiplication method = h(k) = [(a*k) % 2^w] >> (w-r)
        // a-> random number   w= no. of bits in k     m=2^r
        // Universal Hashing -> h(k) = [(ak + b) % p] % m
        // probability p[h(k1) = h(k2)] = 1/m
        // Size of table = m=theta(n)
        // start small and then grow
        //2.open addressing -> only one item per slot m>=n
        // probe -> try
        // Probing strategies : 1. Linear probing : h(k,i) = [h(k) + i]%m
        // 2. Dobule hashing -> 2 hash funtions
        // Uniform hashing assumption -> every key is eqaully likely to have m! permutations
        // when to use ?
        // open add -> better cache  performance (ptrs not needed)
        // chaining -> less sensitive to hash functns

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kunal", 20);
        map.put("Nilam", 99);
        map.put("Riya", 10);

        System.out.println(map.get("Nilam"));
        System.out.println(map.getOrDefault("hiugiu",0));
        System.out.println(map.containsKey("Riya"));

        HashSet<Integer> set = new HashSet<>();

        set.add(23);
        set.add(43);
        set.add(23); // no duplicates

        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("Nilam", 99);
        map2.put("Kunal", 20);

        map2.put("Riya", 10);

        System.out.println(map2);
    }
}
