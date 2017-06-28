import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @project: 1Arrays&Strings
 * @author: liangb.dev
 * @version: 1.0
 * @date: 6/20/2017
 */

public class HashT<T> implements IHashT<T> {

    // LinkedList of LinkedList<String>
    private LinkedList<LinkedList<T>> paragraph = new LinkedList<LinkedList<T>>();

    // Default Constructor
    public HashT() {
        //LinkedList<String> line = new LinkedList<String>();
        for (int i=0;i<100;i++) {
            paragraph.add(new LinkedList<T>());
        }
    }

    // Integer Size Constructor
    public HashT(int size) {
        //LinkedList<String> line = new LinkedList<String>();
        for (int i=0;i<size;i++) {
            paragraph.add(new LinkedList<T>());
        }
    }

    // return paragraph
    public LinkedList<LinkedList<T>> getPara() {
        return paragraph;
    }

    // Hash value->key
    public int hashValue(T value) {
        int key = value.hashCode();
        key = Math.abs(key)%100;
        return key;
    }

    // Store value
    public void storeValue(T value) {
        paragraph.get(hashValue(value)).add(value);
    }

    // Get value
    public LinkedList<T> getValue(int key) {
        return paragraph.get(key);
    }

    // print LinkedList
    public void printLL(LinkedList<T> line) {
        Object[] arr = line.toArray();
        for (int i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        System.out.println("====== HashT ======");

        HashT hash = new HashT();
        hash.storeValue("Playe");
        hash.printLL(hash.getValue(77));



    }

}


