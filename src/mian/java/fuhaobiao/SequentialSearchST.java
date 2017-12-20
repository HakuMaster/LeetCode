package fuhaobiao;

import java.util.ArrayList;
import java.util.List;

public class SequentialSearchST<Key, Value> {
    // 链表首结点
    private Node first;

    // 链表结点的定义
    private class Node {
        Key key;
        Value val;
        Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 查找给定的键，返回相关联的值
     */
    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next)
            // 命中
            if (key.equals(x.key))
                return x.val;
        // 未名中
        return null;
    }

    /**
     * 查找给定的键，找到则更新其值，否则在表中新建结点
     */
    public void put(Key key, Value val) {
        for (Node x = first; x != null; x = x.next)
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }      // 命中，更新
        // 未命中，新建结点
        first = new Node(key, val, first);
    }

    public int size() {
        int i = 0;
        for (Node x = first; x != null; x = x.next) {
            i = i + 1;
        }
        return i;
    }

    public List keys() {
        List<Key> list = new ArrayList<Key>();
        for (Node x = first; x != null; x = x.next) {
            list.add(x.key);
        }
        return list;
    }

    public void delete(Key key) {
        for (Node x = first; x != null; x = x.next)
            if (key.equals((x.next).key)) {
                x.next = (x.next).next;
            }      // 命中，更新
    }
}
