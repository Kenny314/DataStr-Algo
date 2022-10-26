package com.kenny.liner._02Queue;

public class Queue {
    private int queueSize;
    private int front = -1;
    private int rear = -1;
    private int queue[];

    public Queue(int queueSize){
        this.queueSize = queueSize;
        queue = new int[queueSize];
        this.front = -1;
        this.rear = -1;
    }

    public void addItem(int item) {
        if(!isFull()){
            this.rear++;
            queue[rear] = item;
        } else {
            throw new RuntimeException("full");
        }
    }

    public int removeItem()  {
        if(isEmpty()){
            throw new RuntimeException("empty");
        } else {
            this.front++;
            return queue[front];
        }
    }

    public boolean isFull(){
        return this.rear == queueSize -1;
    }

    public boolean isEmpty(){
        return this.rear == this.front;
    }

    public void listQueseItems(){
        if(isEmpty()){

        } else {
            for(int i = 0 ;i < this.queue.length;i++){
                System.out.printf("arr[%d]=%d \t",i,queue[i]);
            }
        }
    }

    /**
     * the position of queue head
     * @return
     */
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("empty");
        } else {
            return this.front;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.addItem(1);
        q.addItem(2);
        q.addItem(3);
        q.addItem(4);
        q.addItem(5);


        q.listQueseItems();
    }
}
