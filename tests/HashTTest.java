import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @project: 1Arrays&Strings
 * @author: liangb.dev
 * @version: 1.0
 * @date: 6/20/2017
 */
class HashTTest {

    HashT<String> hash = new HashT();

    @Test
    void hashValue() {
        assertEquals(77,hash.hashValue("Playe"));
        assertEquals(98,hash.hashValue("test"));
    }

    @Test
    void storeValue() {
        hash.storeValue("Playe");
        assertEquals(1,hash.getPara().get(77).size());
        assertEquals("Playe",hash.getValue(77).getFirst());
        hash.storeValue("Playe");
        assertEquals(2,hash.getPara().get(77).size());
        assertEquals("Playe",hash.getValue(77).getFirst());
        assertEquals(hash.getValue(77).get(1), hash.getValue(77).get(0));
        assertEquals(0, hash.getPara().get(98).size());
        hash.storeValue("test");
        assertEquals(2,hash.getPara().get(77).size());
        assertEquals(1,hash.getPara().get(98).size());
    }

    @Test
    void getValue() {
    }


}