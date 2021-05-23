
/**
 * created a generic interface
 * Added two methods get value and set value
 */
public interface INode<K>
{
    K getKey();
    void setKey(K key);

    INode getNext();
    void setNext(INode next);

}