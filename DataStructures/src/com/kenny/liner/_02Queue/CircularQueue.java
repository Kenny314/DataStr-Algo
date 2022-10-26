package com.kenny.liner._02Queue;

public class CircularQueue {
    private int circularQueue[];
    private int queueSize;
    private int head;
    private int rear;

    /**
     * front point to first position
     * rear point to the next position of last item
     * @param queueSize
     */
    public CircularQueue(int queueSize){
        this.queueSize = queueSize;
        circularQueue = new int[queueSize];
        this.head = 0;
        this.rear = 0;
    }

    public boolean isFull(){
        return (this.rear+1) % this.queueSize == this.head;
    }

    public boolean isEmpty(){
        return this.rear == this.head;
    }

    public void addItem(int data){
        if(isFull())
            throw new RuntimeException("full");
        this.circularQueue[rear] = data;
        //循环队列，需要判断是否是最后一个
        this.rear = (this.rear+1) % queueSize;
    }

    public int getItem(){
        if(isEmpty())
            throw new RuntimeException("full");
        /*
        front 是指向队列到第一个元素
        1.先把front值保存到临时变量
        2.将front后移
        3。将临时保存到变量返回
         */
        int data = this.circularQueue[head];
        head = (head + 1) % this.queueSize;
        return data;
    }

    public void listQueue(){
        /*
        从front 开始遍历，遍历多少个元素
         */
        if(isEmpty())
            throw new RuntimeException("empyt");

        for(int i = head ; i < head + size(); i++){
            System.out.printf("arr[%d]=%d\t",(i%queueSize),circularQueue[i%queueSize]);
        }
    }

    /**
     *  当前队列有效数据个数
     */
    public int size(){
        return (this.rear + this.queueSize - this.head) % this.queueSize;
    }
}
