package Queues;

public class QueueMain {
     
    public static void main(String[] args) {
        CustomQueue customQueue= new CustomQueue();
        customQueue.insert(3);
        customQueue.insert(4);
        customQueue.display();
        customQueue.remove();
        customQueue.display();
    }
}
