import java.util.LinkedList;

/**
 * @project: 1Arrays&Strings
 * @author: liangb.dev
 * @version: 1.0
 * @date: 6/20/2017
 */
public interface IHashT<T> {

    public LinkedList<LinkedList<T>> getPara();
    public int hashValue(T value);
    public void storeValue(T value);
    public LinkedList<T> getValue(int key);



}
