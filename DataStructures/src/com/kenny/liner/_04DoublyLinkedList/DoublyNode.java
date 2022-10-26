package com.kenny.liner._04DoublyLinkedList;

public class DoublyNode {
    public Object data;
    public DoublyNode pre;
    public DoublyNode next;


    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;
        if( !(o instanceof DoublyNode))
            return false;
        DoublyNode node = (DoublyNode)o;
        if(node.data.equals(this.data)){
            return true;
        } else {
            return false;
        }
    }
}
