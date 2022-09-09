package openChallenges;

import static java.lang.System.out;

public class QueueUsingStack {
    public static void main(String [] args){
        Queue numberQueue = new Queue(10);
        try {
            numberQueue.enqueue(2);
            numberQueue.enqueue(3);
            numberQueue.enqueue(4);
            numberQueue.enqueue(5);
            numberQueue.enqueue(6);
            numberQueue.enqueue(7);
            numberQueue.enqueue(8);
            numberQueue.enqueue(8);

            numberQueue.dequeue();
            numberQueue.printQueue();
            numberQueue.dequeue();
//            numberQueue.dequeue();
//            numberQueue.printQueue();
//            numberQueue.dequeue();
            numberQueue.printQueue();
//
            numberQueue.top();

        }catch (Exception e){
            out.println(e.getMessage());
        }
    }
}
