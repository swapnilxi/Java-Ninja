package Queues;

public class CircularQueue {
    protected int[] data;
    protected int front=0;
    protected int end=0;
    private int size=0;
private static final int DEFAULT_SIZE=10;

 public CircularQueue(){
    this(DEFAULT_SIZE);
 }
 public CircularQueue(int size){
    this.data= new int[size];//data array
 }
public boolean isFull(){
    return end==data.length;
}
public boolean isEmpty(){
    return end==0;
}

    
}
