package com.kenny.liner._03LinkedList;

import java.util.Stack;

public class LinkedList {
    private Node head;
    private Node next;

    /**
     *  constructor next node is null;
     * @param head
     */
    public LinkedList(Node head){
        this.head = head;
        this.next = null;
    }

    /**
     * 添加元素到末尾
     * @param item
     */
    public void addItme(Node item){
        Node rear = getRear();
        item.next = null;
        rear.next = item;
    }

    /**
     * 找到链表到最后节点
     * @return
     */
    public Node getRear(){
        if(this.head.next == null)
            return this.head;

        Node temp = this.head.next;

        while(true){
            if(temp.next == null){
                return temp.next;
            } else {
                temp = temp.next;
            }
        }
    }

    /**
     *
     */
    public void showLinkedList(){
        Node head = this.head;
        System.out.println("head = " + this.head);
        Node temp = this.head.next;
        int i = 1;
        if(temp != null){
            System.out.println("node"+i + "=" +temp);
            temp = temp.next;
        }
    }

    /**
     * 在指定节点后插入节点
     * @param before
     * @param insertNode
     */
    public void insertNode(Node before, Node insertNode){
        Node temp = before.next;
        before.next = insertNode;
        insertNode.next = temp;
    }

    /**
     * 删除指定节点
     * @param o
     */
    public Node deleteNode(Object o){
        Node node = this.head;
        if(node.next == null){
            // null LinkedList
            return null;
        }
        while(true){
            if(node.next.data == o){
                Node result = node.next;
                node.next = node.next.next;
                return result;
            } else {
                node = node.next;
            }
        }

    }

}
