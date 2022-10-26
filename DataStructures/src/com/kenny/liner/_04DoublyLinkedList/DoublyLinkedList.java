package com.kenny.liner._04DoublyLinkedList;

public class DoublyLinkedList {
    public DoublyNode head;

    public DoublyNode getHead(){
        return this.head;
    }

    /**
     * traverse
     */
    public void traverseDoublyLinkedList(){
        if(this.head.next == null)
            System.out.println("empty");
        else{
            DoublyNode temp = this.head.next;
            while(temp != null){
                System.out.println(temp);
                temp = temp.next;
            }
        }
    }

    public void addNode(DoublyNode node){
        if(this.head.next == null){
            this.head.next = node;
            node.pre = this.head;
            node.next = null;
        } else {
            DoublyNode temp = this.head.next;
            while(temp != null){
                temp = temp.next;
            }
            temp.next = node;
            node.pre = temp;
            node.next = null;
        }
    }

    /**
     * remove node
     * @param node
     */
    public void removeNode(DoublyNode node){
        if(this.head.next == null){
            throw new RuntimeException("empty");
        } else {
            DoublyNode temp = this.head.next;
            while(temp != null){
                if(temp.equals(node)){
                    temp.pre.next = temp.next.next;
                    temp.next.pre = temp.pre;
                }
                temp = temp.next;
            }
        }
    }
}
