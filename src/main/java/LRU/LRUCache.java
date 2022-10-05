package LRU;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class dLinkNode{
        int key;
        int value;
        dLinkNode pre;
        dLinkNode next;
    }
    private Map<Integer, dLinkNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private dLinkNode head, tail;

    private void addNode(dLinkNode node){
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    private void removeNode(dLinkNode node){
        dLinkNode next = node.next;
        dLinkNode pre = node.pre;
        pre.next = next;
        next.pre = pre;
    }

    private void moveToHead(dLinkNode node){
        removeNode(node);
        addNode(node);
    }

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new dLinkNode();
        tail = new dLinkNode();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        dLinkNode node = cache.get(key);
        if(node == null){return -1;}
        moveToHead(node);
        return node.value;
    }

    private dLinkNode popTail(){
        dLinkNode ret = tail.pre;
        removeNode(ret);
        return ret;
    }

    public void put(int key, int value) {
        dLinkNode node = cache.get(key);
        if(node == null){
            dLinkNode newNode = new dLinkNode();
            newNode.key = key;
            newNode.value = value;
            cache.put(key, newNode);
            addNode(newNode);
            ++size;
            if(size > capacity){
                // pop tail
                dLinkNode tail = popTail();
                cache.remove(tail.key);
                --size;
            }
        }else{
            node.value = value;
            moveToHead(node);
        }
    }
}
