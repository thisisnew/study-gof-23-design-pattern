package part20.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private Map<String, BigChar> pool = new HashMap<>();
    private static BigCharFactory instance = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return instance;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bc = pool.get(String.valueOf(charName));

        if (bc == null) {
            bc = new BigChar(charName);
            pool.put(String.valueOf(charName), bc);
        }

        return bc;
    }
}
