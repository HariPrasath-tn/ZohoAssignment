import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;
import java.util.Stack;

final class Queue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    private final int MAX_SIZE;
    private int size=0;


    Queue(int maxSize){
        MAX_SIZE = maxSize;
    }

    private boolean isFull(){
        if (MAX_SIZE == size)
            return true;
        return false;
    }

    private boolean isEmpty(){
        if (0 == size)
            return true;
        return false;
    }

    private void makeStack2(){
        for(int i=0; i<this.stack1.size(); i++){
            if(this.stack2.size() < i+1){
                this.stack2.add(stack1.get(size-i-1));
                continue;
            }
            this.stack2.set(i, stack1.get(size-i-1));
        }
    }

    private void appendStack1(int number){
        this.stack1.add(number);
        this.makeStack2();
        this.size++;
    }

    private void popStack1(){
        out.print(this.stack1 + " " +  size + ' ' + this.stack1.size() + ' ' + this.stack2.size() + " " + this.stack2);
        this.stack1.remove(0);
        this.stack2.remove(size-2);
//        this.makeStack2();
        this.size--;
    }

    public void enqueue(int number) throws Exception{
        if(this.isFull()){
            throw new QueueException("Queue Overflows Exception");
        }
        this.appendStack1(number);
    }

    public void dequeue() throws Exception{
        if(this.isEmpty()){
            throw new QueueException("Queue underflow Exception");
        }
        this.popStack1();
    }
    private class QueueException extends Exception{
        QueueException(String exception){
            super(exception);
        }
    }

    private Integer getTop(){
        return this.stack2.get(0);
    }

    public void top() throws Exception{
        if(this.isEmpty()){
            throw new QueueException("Queue underflow Exception");
        }
        int top = (int)this.getTop();
        out.println("Top : " + top);
    }

    public void printQueue() throws Exception{
        if(this.isEmpty()){
            throw new QueueException("Queue underflow Exception");
        }
        out.print("Queue elements are : ");
        out.println(this.stack1);
    }
}
